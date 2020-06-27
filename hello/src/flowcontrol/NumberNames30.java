package flowcontrol;

import java.util.Scanner;

// TODO: Refactor statics to class

// TODO: Refactor to methods

// TODO: Use composition or inheritance to reuse

public class NumberNames30 {

    final static String[] two_digits = new String[]{"ten", "eleven", "twelve",
            "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty"};

    // Use composition
    public NumberNames09 numbersTill10 = new NumberNames09();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Naming numbers. Quit by typing 'exit'");

        String digit = "";

        do {

            System.out.println("Please enter a digit up to 30:");
            digit = scanner.next();

            if (digit.length() == 2 && digit.charAt(0) == '1') {

            /* Explicitly handle 10-19. Sum of the two digits is used as index of "two_digits"
            array of strings */

                System.out.println( digit + " is " + NumberNames30.two_digits[digit.charAt(1) - '0']);

            } else if (digit.length() == 2 && digit.charAt(0) == '2') {

                System.out.println( digit + " is " + two_digits[two_digits.length - 1] +
                        " " + NumberNames09.single_digits[(digit.charAt(1) - '0')]);

            } else if (digit.length() == 1) {

                if (digit.charAt(0) - '0' > 0) {

                    System.out.println(digit + " is " + NumberNames09.single_digits[digit.charAt(0) - '0']);

                } else {

                    // For zero: take the last in array
                    System.out.println(digit + " is " +
                            NumberNames09.single_digits[NumberNames09.single_digits.length - 1]);
                }

            } else {

                System.out.println("Only numbers less than 30 is valid input");
            }

            System.out.println("Next digit or 'exit'");

        } while (!digit.equals("exit"));

    }

}
