package inheritance;

import flowcontrol.NumberNamesTillHundred;

import java.util.Scanner;

/**
 * Refactor even more, make the loop a procedure
 * Make use of regex, compacting the program
 */

public class InheritanceClassExample02 {

    // Class variable
    private InheritedClassInterface digitAsWord;

    // Introducing constructor
    public InheritanceClassExample02() {

        // Initialization of a member variable, note the initialization
        digitAsWord = new NumberNamesTillHundred( "" );
    }

    public static void main(String[] args) {

        InheritanceClassExample02 classExample02 = new InheritanceClassExample02();

        System.out.println("Naming numbers. Quit by typing 'exit'");
        String digit = "";

        try {
            classExample02.looping(digit);

        } catch (Exception e) {

            System.err.println(e.getMessage());
            return;
        }

    }

    // Create a procedure instead for looping only
    private void looping(String digit) throws Exception {

        // Make scanner local now
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Please enter a digit up to 100: ");

            digit = scanner.next();
            digitAsWord.setDigit( digit );

            String integerAsWord = digitAsWord.digitAsWord();

            if ( !integerAsWord.isEmpty() ) {
                System.out.println("Digit is: " + integerAsWord);

            }

        } while (!digit.equals("exit"));

    }

}
