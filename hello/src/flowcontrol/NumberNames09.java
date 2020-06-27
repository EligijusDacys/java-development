package flowcontrol;

import java.util.Scanner;

// TODO: Rework as a class
public class NumberNames09 {

    final static String[] single_digits = new String[]{"", "one",
            "two", "three", "four",
            "five", "six", "seven",
            "eight", "nine", "zero"};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Naming numbers. Quit by typing 'exit'");

        String digit = "";

        /*
        do {

            System.out.println("Please enter a digit:");
            digit = scanner.next();

            /// For single digit number
            if (digit.length() == 1) {

                // Take a string, convert it to value:  "5" --> 5
                if (digit.charAt(0) - '0' > 0) {

                    System.out.println(digit + " is " + NumberNames09.single_digits[digit.charAt(0) - '0']);

                } else {

                    System.out.println(digit + " is " + NumberNames09.single_digits[single_digits.length - 1]);
                }

                // Add break here
                // Add return here, what happens?

            } else {
                System.out.println("Only less than two digits is valid input");
            }

            System.out.println("Next digit or 'exit'");

        } while (!digit.equals("exit"));
        */

        for ( int i = 0; i < 10; i++ ) {
            System.out.println( asNumber( Integer.toString( i ) ) );
        }

        System.out.println( asNumber( Integer.toString( -2 ) ) );
        System.out.println( asNumber( Integer.toString( 10 ) ) );
    }

    public static String asNumber( final String digit ) {
        /* For single digit number */

        if (digit.length() == 1) {

            // Take a string, convert it to value:  "5" --> 5
            if (digit.charAt(0) - '0' > 0) {

                return NumberNames09.single_digits[digit.charAt(0) - '0'];

            } else {

                return NumberNames09.single_digits[single_digits.length - 1];
            }

        } else
            return "";
    }

}
