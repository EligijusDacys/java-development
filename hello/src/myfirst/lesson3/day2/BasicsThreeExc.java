package myfirst.lesson3.day2;

import java.util.Arrays;

public class BasicsThreeExc {

    static String align( int length ) {

        String alignedTabs = "";
        for ( int i = 0; i <= length; i++ )  {

            alignedTabs += "\t";

            //alignedTabs = alignedTabs + "\t";
        }

        return alignedTabs;

    };

    public static void main(String[] args) {

        String []
        lines = new String[3];

        lines[0] = "Hello world";
        lines[1] = lines[0] + " then ";

        // Placeholder
        lines[2] = String.format( " %f %s %10s",  2f, lines[0], "now" );

        for ( int i = 0; i <= 2; i++ ) {
                System.out.println( "["+i+"]: " + align( 5 ) + lines[i]);
        }

        System.out.println( Arrays.asList( lines ));


    }
}
