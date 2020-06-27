package myfirst.lesson3.day1;/*
Exercises – data types and variables

1. Create two variables of type int with initial values of 6 and 11.
Print sum of those variables.
2. Read any double literal from the console. Print that value rounded to the second
decimal place.
Input: 3.23523
Output: 3.23
3. *Print values: 192, 168, 1, 10 in HEX format XX:XX:XX:XX.
Use System.out.printf() method.
Input: 192, 168, 1, 10
Output: „C0:A8:01:0A”

*/

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class ExercisesPg19 {

    public static void main(String[] args) {

        System.out.printf( "The date is " +
          " %1$tm ( %<tB ) / %<te ( %<tA ) / %<tY ",
          new Date( ) );

        System.out.println();

        //  1)
        int valueSix = 6, valueEleven = 11;

        // Will NOT print the correct result:
        System.out.println("__INCORRECT__ Sum of valueSix and valueEleven: " + valueSix + valueEleven);

        // Add brackets!
        System.out.println("Sum as (valueSix + valueEleven): " + (valueSix + valueEleven) );

        // Explict value
        System.out.println("Sum as new Integer: " + new Integer(valueSix + valueEleven) );

        // Temporary variable
        final int theSum = valueSix + valueEleven;
        System.out.println("Sum as theSum variable: " + theSum );

        //  2)

        // To read integers from console, use Scanner class.

        Scanner myInput = new Scanner( System.in );

        // Allow a use to add an integer using the nextInt() method.

        System.out.print( "\nEnter the double value: " );
        double readDouble = myInput.nextDouble();

        // Use this reference for round : https://www.baeldung.com/java-round-decimal-number

        // Round to int value
        System.out.println("Rounded to int: " + Math.round( readDouble ) );

        // Round to 2 decimal points
        DecimalFormat decimalFormatter = new DecimalFormat("######.##");
        System.out.println( decimalFormatter.format( readDouble ) );

        //  3)

        // These are all valid variable names:

        int _01hexDigit = 192;

        int $02hexDigit = 168;

        int ___03hexDigit = 1;

        int number_ten = 10;

        // https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html

        // Print as hexadecimal
        System.out.printf("The HEX value is %1$02X:%2$02X:%3$02X:%4$02X \n", _01hexDigit, $02hexDigit, ___03hexDigit, number_ten );

        // Also valid the lowercase
        System.out.printf("Alternatively %1$04x:%2$04x:%3$04x:%4$04x \n", _01hexDigit, $02hexDigit, ___03hexDigit, number_ten );

        System.out.printf("Using Integer.toString : " +Integer.toString(_01hexDigit, 16) +
                        ":" + Integer.toString( $02hexDigit, 16 ) +
                        ":" + Integer.toString(___03hexDigit, 16 ) +
                        ":" + Integer.toString( number_ten, 16 )
        );


    }
}
