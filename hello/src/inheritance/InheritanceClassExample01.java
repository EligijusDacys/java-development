package inheritance;

import flowcontrol.NumberNames30Class;
import flowcontrol.NumberNames30Component;
import flowcontrol.composition.CompositionClassInterface;

import java.util.Scanner;

/**
 * Refactor even more, make the loop a procedure
 * Make use of regex, compacting the program
 */

public class InheritanceClassExample01 {

    // Class variable
    private InheritedClassInterface digitAsWord;

    // Introducing constructor
    public InheritanceClassExample01() {

        // Initialization of a member variable, note the initialization
        digitAsWord = new NumberNames30Class( "" );
    }

    public static void main(String[] args) {

        InheritanceClassExample01 classExample01 = new InheritanceClassExample01();

        System.out.println("Naming numbers. Quit by typing 'exit'");
        String digit = "";

        try {
            classExample01.looping(digit);

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
            digitAsWord.setDigit( digit );

            String integerAsWord = digitAsWord.digitAsWord();

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
