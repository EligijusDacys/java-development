package myfirst.lesson3.day2;

import java.util.Scanner;

/*
Exercises – data types and variables

  * Sum two integer variables initialized with maximal values for that type.

*/
public class BasicsOneDatatypesExc {

    public static void main(String[] args) {

            int maxInt = Integer.MAX_VALUE;

            System.out.println( "Init MAX_VALUE is: " + maxInt);

            // Overflow:  2 * maxInt
            System.out.println( "Integer.MAX_VALUE is: " + ( maxInt + maxInt) );

            System.out.println( "2 x Integer.MAX_VALUE is: " + Integer.MAX_VALUE * 2 );

            Scanner reader = new Scanner(System.in);

            System.out.print( "Enter char: " );

            // How to read a char in scanner
            char oneChar = reader.next().charAt(0);
            System.out.println( "Entered char: " + oneChar );

            System.out.print( "Enter byte: " );
            byte oneByte = reader.nextByte();
            System.out.println( "Entered byte: " + oneByte );

            System.out.print( "Enter Byte: " );
            Byte twoByte = reader.nextByte();
            System.out.println( "Entered Byte: " + twoByte );

            System.out.print( "Enter float: " );
            float oneFloat = reader.nextFloat();
            System.out.println( "Entered float: " + oneFloat );

        System.out.print( "Enter Float: " );
        Float twoFloat = reader.nextFloat();
        System.out.println( "Entered Float: " + twoFloat );

        System.out.println("Enter number");

        int enteredInteger = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            enteredInteger = scanner.nextInt();
        } catch ( java.util.InputMismatchException e ) {
            System.err.println( "Entered intput: " + enteredInteger + " is not valid");
        }

        // Examplary
        if (enteredInteger > 30) {
            System.out.println("It's greater then 30");
        } else if (enteredInteger < 30) {
            System.out.println("It's less then 30");
        } else {
            System.out.println("It's 30");
        }

        /*
        // Over-engineered
        // Neefektyvu, bad programming style. Still works?
        switch (enteredInteger) {
            case 30:
                System.out.println("It's 30");
                break;

            default: {

                final boolean switchOn = enteredInteger > 30;
                switch ( Boolean.valueOf( switchOn ).toString() ) {

                    case "true":
                        System.out.println("It's greater then 30");
                    break;

                    default:
                        System.out.println("It's less then 30");
                }
                break;
            }
        }
        */
    }
}


