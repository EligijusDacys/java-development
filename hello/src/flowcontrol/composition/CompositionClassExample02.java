package flowcontrol.composition;

import flowcontrol.composition.CompositionClassInterface;
import flowcontrol.NumberNames30Component;

import java.util.Scanner;

/**
 *
 *  Refactor to use only one Composite->uses->Composite case
 *
 */

public class CompositionClassExample02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Naming numbers. Quit by typing 'exit'");

        CompositionClassInterface digitAsWord = new NumberNames30Component();

        String digit = "";

        do {

            System.out.println("Please enter a digit up to 30: ");
            digit = scanner.next();

            final String integerAsWord = digitAsWord.digitAsWord( digit );

            if (!integerAsWord.isEmpty()) {

                System.out.println("Digit is: " + integerAsWord);

            } else {

                if (digit.matches(CompositionClassInterface.regexForDigits)) {

                    System.err.println("Digit entered is too large. ");
                } else {

                    System.err.println("OK, exit. ");
                }
            }

            System.out.println("Next digit or 'exit'");

        } while (!digit.equals("exit"));

    }

}
