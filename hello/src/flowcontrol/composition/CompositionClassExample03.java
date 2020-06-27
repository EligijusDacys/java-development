package flowcontrol.composition;

import flowcontrol.composition.CompositionClassInterface;
import flowcontrol.NumberNames30Component;

import java.util.Scanner;

/**
 *
 *  Refactor to use only one Composite->uses->Composite case
 *  Make use of regex, compact the program
 *
 */

public class CompositionClassExample03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Naming numbers. Quit by typing 'exit'");

        CompositionClassInterface digitAsWord = new NumberNames30Component();

        String digit = "";

        do {

            System.out.println("Please enter a digit up to 30: ");
            digit = scanner.next();

            final String integerAsWord = digitAsWord.digitAsWord( digit );

            // Now, let's check the result instead, not the input
                if ( integerAsWord.matches( CompositionClassInterface.regexForLowLetters) ) {

                    System.out.println("Digit is: " + integerAsWord);

                } else {

                    // The exception situation is there: 'exit' or 30 will return the same
                    System.err.println("Digit entered is too large. ");
                }

            System.out.println("Next digit or 'exit'");

        } while (!digit.equals("exit"));

    }

}
