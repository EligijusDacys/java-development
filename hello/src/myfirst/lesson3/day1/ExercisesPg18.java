package myfirst.lesson3.day1;/*
Exercises – data types and variables
        1. Define (declare and initialize) two variables: one of type „int” and second of type
        „double”. Print theirs values.
        Output:
        19
        187.2342
        2. Define variable of type int. What is a maximum and minimum value, that you are able
        to store within that variable?
        3. Do the same as above for other numeric types (long, double, byte..). Check results.
        4. Define the int type variable with maximum value. Add 1 to it. What do you think will
        happen?
*/

public class ExercisesPg18 {

    public static void main(String[] args) {

    //  1)

        int intValue = 19;
        double commaDigit = 187.2342;

        // Let's print using one statement
        // We know how to do it now!
        System.out.println( intValue + "\n" + commaDigit );

    //  2)

        int maxInt = Integer.MAX_VALUE;
        System.out.println( "Integer.MAX_VALUE is: " + maxInt  );
        System.out.println( Integer.MIN_VALUE  );

    // 3)

        System.out.println( "\nLong: " + Long.MAX_VALUE  );
        System.out.println( Long.MIN_VALUE  );

        System.out.println( "\nDouble: " + Double.MAX_VALUE  );
        System.out.println( Double.MIN_VALUE  );

        System.out.println( "\nFloat: " + Float.MAX_VALUE  );
        System.out.println( Float.MIN_VALUE  );

        System.out.println( "\nByte: " + Byte.MAX_VALUE  );
        System.out.println( Byte.MIN_VALUE  );

    // 4)

        // Overflow: max out reserved space for digit

        int maxIntPlusOne = Integer.MAX_VALUE + 1;
        System.out.println( "\nMax becomes min: " + maxIntPlusOne );

     // 5)

        // Overflow: max out reserved space for digit
        System.out.println( "\nLong: " + Long.MAX_VALUE  );
        long maxLongPlusOne = Long.MAX_VALUE + 1;
        System.out.println( "\nLong max becomes min: " + maxLongPlusOne );
    }

}
