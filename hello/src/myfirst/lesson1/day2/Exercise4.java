package myfirst.lesson1.day2;

public class Exercise4 {

    public static void main ( String [ ] args ) {

        // num1 = 20, num2 = 15
        printComparison( 20, 15 );
        printComparison( 40, 40 );
        printComparison( 60, 35 );
    }

    // to be reused over and over again
    public static void printComparison(int num1, int num2) {
        System.out.println("Comparing " + num1 + " - " + num2);

        if (num1 == num2) {

            // Early String.formatting
            // System.out.printf("%d == %d\n", num1, num2);
            System.out.println( " number one " + num1 + " == number two " + num2 );
        } else {
            System.out.printf("%d != %d\n", num1, num2);
        }

        if (num1 < num2) {
            System.out.printf("%d < %d\n", num1, num2);
        }
        if (num1 > num2) {
            System.out.printf("%d > %d\n", num1, num2);
        }
        if (num1 <= num2) {
            System.out.printf("%d <= %d\n", num1, num2);
        }
        if (num1 >= num2) {
            System.out.printf("%d >= %d\n", num1, num2);
        }
    }
}
