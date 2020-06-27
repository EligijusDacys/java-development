package utilize;

import flowcontrol.NumberNamesTillHundred;
import flowcontrol.composition.CompositionClassInterface;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

/**
 * OK, let's print the sums up to 100 in USD and cent
 * reusing the components that we developed for naming numbers.
 *
 */

public class ReuseComponentsExample implements CompositionClassInterface {

    protected static DecimalFormat decimalFormatter = new DecimalFormat("\u00A4#######0.00");
    private NumberNamesTillHundred dollarAmounts, centAmounts;

    public ReuseComponentsExample() {

        dollarAmounts = new NumberNamesTillHundred("0");
        centAmounts = new NumberNamesTillHundred("0");

    }

    public static void main(String[] args) {

        System.out.println("Print amounts less than 100 in USD. Quit by typing 'exit'");
        String digit = "";

        try {
            new ReuseComponentsExample().looping(digit);

        } catch (Exception e) {
            System.err.println( "You've enterred something else. Exit" );
        }

    }

    @Override
    public String digitAsWord(String digit) {
        return dollarAmounts.digitAsWord() + " USD " + centAmounts.digitAsWord() + " ct. ";
    }

    public void looping(String digit) throws Exception {

        // Make scanner local now
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.print("\nPlease enter an amount as double: ");
            double readDouble = scanner.nextDouble();

            System.out.println( this.printAsCurrency(readDouble) );

            System.out.println("Next amount or 'exit'");

        } while (!digit.equals("exit"));
    }


    private String printAsCurrency(final double amountSum) {

        // Round to 2 decimal points
        System.out.println( decimalFormatter.format(amountSum) );

        // Round to int value
        System.out.println("Rounded as: " + decimalFormatter.getCurrency() + " " + Math.round(amountSum));

        Number asDouble = 0;
        try {
            asDouble = decimalFormatter.parse( decimalFormatter.format(amountSum) );
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {

            BigDecimal dollarDecimal = new BigDecimal(String.valueOf(asDouble));
            int dollars = dollarDecimal.intValue();

            dollarAmounts.setDigit(String.valueOf(dollars));
            centAmounts.setDigit(dollarDecimal.subtract(
                    new BigDecimal(dollars)).movePointRight(2).toString());

        } catch (Exception e) {

            e.printStackTrace();
            centAmounts.setDigit("0");
        }

        return dollarAmounts.digitAsWord() + " " + decimalFormatter.getCurrency().getCurrencyCode() + " and " +
                centAmounts.digitAsWord() + " ct. ";
    }
}
