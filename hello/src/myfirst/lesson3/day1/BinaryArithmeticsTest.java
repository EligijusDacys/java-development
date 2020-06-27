package myfirst.lesson3.day1;

import java.math.BigInteger;

// Check the results by ///////
/*----- Bitwise Operator Table-

        A   B   A|B A&B A^B ~A
        0   0   0   0   0   1
        1   0   1   0   1   0
        0   1   1   0   1   1
        1   1   1   1   0   0

*/////////////////////////////

public class BinaryArithmeticsTest {

    public static void main(String[] args) {

        int hexValue = 0xFF;
        System.out.println("Hexvalue variable: " + hexValue );

        System.out.println( "\n---LSHIFT---" );

         // e.g. SHA1
         for ( int shift = 1; shift < 8; shift++) {
             int shitfLeft = hexValue << shift;
             System.out.println("shitfLeft variable: " + shitfLeft
                     + " HEX: " + Integer.toString( shitfLeft,16 ).toUpperCase()
                     + " \nBIN: " +
                     String.format("%016d", new BigInteger(Integer.toString(shitfLeft, 2))));
         }

        System.out.println( "\n---RSHIFT---" );

        hexValue = -1 * 0xFF;
        for ( int shift = 1; shift < 8; shift++) {
            int shitfRight = hexValue >> shift;
            System.out.println("shitfLeft variable: " + shitfRight
                    + " HEX: " + Integer.toString( shitfRight,16 ).toUpperCase()
                    + " \nBIN: " +
                    String.format("%016d", new BigInteger(Integer.toString(shitfRight, 2))));
        }

        System.out.println( "\n---RSHIFT UNSIGNED---" );

        hexValue = -0xFF;

        System.out.println("hexValue variable: " + hexValue
                + " HEX: " + Integer.toString( hexValue,16 ).toUpperCase()
                + " \nBIN: " +
                String.format("%032d", new BigInteger(Integer.toString(hexValue, 2))));

        for ( int shift = 1; shift < 32; shift++) {
            int shitfRight = hexValue >>> shift;
            System.out.println("shitfLeft variable: " + shitfRight
                    + " HEX: " + Integer.toString( shitfRight,16 ).toUpperCase()
                    + " \nBIN: " +
                    String.format("%032d", new BigInteger(Integer.toString(shitfRight, 2))));
        }

        System.out.println( "\n---NEGATIVES---" );

        // Negatives
        hexValue = 0xFFFFFFE2;
            System.out.println("hexValue variable: " + hexValue
                    + " HEX: " + Integer.toString( hexValue,16 ).toUpperCase()
                    + " \nBIN: " +
                    String.format("%016d", new BigInteger(Integer.toString(hexValue, 2))));

        System.out.println( "\n---OR---" );

        // Binary OR
        hexValue = 0xFF | 0x01;
        System.out.println("hexValue variable: " + hexValue
                    + " HEX: " + Integer.toString( hexValue,16 ).toUpperCase()

                + " \nBIN: " +
                String.format("%016d", new BigInteger(Integer.toString(0xFF, 2)))

                + " \nBIN: " +
                String.format("%016d", new BigInteger(Integer.toString(0x01, 2)))

                + " \nBIN: " +
                String.format("%016d", new BigInteger(Integer.toString( hexValue, 2))));

        System.out.println( "\n---AND---" );

        // Binary AND
        hexValue = 0xFF & 0x01;
        System.out.println("hexValue variable: " + hexValue
                + " HEX: " + Integer.toString( hexValue,16 ).toUpperCase()

                + " \nBIN: " +
                String.format("%016d", new BigInteger(Integer.toString(0xFF, 2)))

                + " \nBIN: " +
                String.format("%016d", new BigInteger(Integer.toString(0x01, 2)))

                + " \nBIN: " +
                String.format("%016d", new BigInteger(Integer.toString( hexValue, 2))));

        System.out.println( "\n---XOR---" );

        // Binary XOR
        hexValue = 0xFF ^ 0x01;
        System.out.println("hexValue variable: " + hexValue
                + " HEX: " + Integer.toString( hexValue,16 ).toUpperCase()

                + " \nBIN: " +
                String.format("%016d", new BigInteger(Integer.toString(0xFF, 2)))

                + " \nBIN: " +
                String.format("%016d", new BigInteger(Integer.toString(0x01, 2)))

                + " \nBIN: " +
                String.format("%016d", new BigInteger(Integer.toString( hexValue, 2))));

        System.out.println( "\n---NOT---" );

        // Binary NOT
        hexValue = ~ 0xFF ;
        System.out.println("hexValue variable: " + hexValue
                + " HEX: " + Integer.toString( hexValue,16 ).toUpperCase()

                + " \nBIN: " +
                String.format("%016d", new BigInteger(Integer.toString(0xFF, 2)))

                + " \nBIN: " +
                String.format("%016d", new BigInteger(Integer.toString( hexValue, 2))));
}
}
