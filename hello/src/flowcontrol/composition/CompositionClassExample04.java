package flowcontrol.composition;

import flowcontrol.NumberNames30Component;

import java.util.Scanner;

/**
 * Refactor even more, make the loop a procedure
 * Make use of regex, compacting the program
 */

public class CompositionClassExample04 {

    // Class variable
    private CompositionClassInterface digitAsWord;

    // Introducing constructor
    public CompositionClassExample04() {

        // Initialization of a member variable
        digitAsWord = new NumberNames30Component();
    }

    public static void main(String[] args) {

        CompositionClassExample04 compositionClassExample = new CompositionClassExample04();

        System.out.println("Naming numbers. Quit by typing 'exit'");
        String digit = "";

        try {
            compositionClassExample.looping(digit);

        } catch (Exception e) {

            System.err.println(e.getMessage());
            System.err.println("OK, exit. ");
            return;
        }

    }

    // Create a procedure instead
    private void looping(String digit) throws Exception {

        // Make scanner local now
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Please enter a digit up to 30: ");
            digit = scanner.next();

            final String integerAsWord = digitAsWord.digitAsWord(digit);

            // Now, let's check the range input instead,
            if ( digit.matches( CompositionClassInterface.regexForRangeDigits ) ) {

                System.out.println("Digit is: " + integerAsWord);

            // Input is a digit, just too large
            } else if ( digit.matches( CompositionClassInterface.regexForDigits )) {

                System.out.println("Digit entered is too large. ");
            }

                else {

                // Define exception concept: input was not a digit at all
                throw new Exception("You've entered something else. Let's quit then. ");

            }

            System.out.println("Next digit or 'exit'");

        } while (!digit.equals("exit"));

    }

}
