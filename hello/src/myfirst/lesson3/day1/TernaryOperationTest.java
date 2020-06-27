package myfirst.lesson3.day1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TernaryOperationTest {

    public static void main(String[] args) {

        boolean valueAsTernary = ( exitAsTrue() && exitAsFalse() ) ?
                Boolean.valueOf( "true" ) :
                Boolean.valueOf( "false" );

        System.out.println("1#) valueAsTernary: " + valueAsTernary );

        valueAsTernary = false;

        if ( true ) {
            valueAsTernary = Boolean.valueOf( "true" );
            System.out.println("2# ) valueAsTernary: " + valueAsTernary );
        } else {
            valueAsTernary = Boolean.valueOf( "false" );
            System.out.println("3#) valueAsTernary: " + valueAsTernary );
        }

        System.out.println("4#) valueAsTernary: " + valueAsTernary );

        int k = 28;
        boolean valueMoreThan30 = ( k > 30 ) ?
                Boolean.valueOf( "true" ) :
                Boolean.valueOf( "false" );

        System.out.println("valueMoreThan30: " + valueMoreThan30 );

        int n = 10;
        n <<= ( k > 30 ) ? (k / 2) : k / 3;

        System.out.println("shitfleft 10: " + k + " n: "  + n );

    } // end main

    static boolean exitAsTrue() {
        System.out.println("Exit as true" );
        return true;
    }; // end

    static boolean exitAsFalse() {
        System.out.println("Exit as false" );
        return false;
    }; // end

} // end class