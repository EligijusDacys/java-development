package flowcontrol.composition;

import flowcontrol.composition.CompositionClassInterface;
import flowcontrol.NumberNames09Component;
import flowcontrol.NumberNames30Component;

import java.util.Scanner;

/**
 *  Explaining how to use Composition in general
 *
 * */

public class CompositionClassExample01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Naming numbers. Quit by typing 'exit'");

        NumberNames09Component digitAsWordTo10 = new NumberNames09Component();
        NumberNames30Component digitAsWordTo30 = new NumberNames30Component();

        String digit = "";

        do {

            System.out.println("Please enter a digit up to 30: ");
            digit = scanner.next();

            /* For single digit numbers */
            if (digit.length() == 1) {

              // Note different implementations of Interface  CompositionClassInterface
              System.out.println( "Single is: " + digitAsWordTo10.digitAsWord( digit ) );

            } else {

                /* For two digit numbers */
                final String digitAsWord = digitAsWordTo30.digitAsWord( digit );

                if ( !digitAsWord.isEmpty() ) {

                    System.out.println( "Digit is: " + digitAsWord );

                } else  {

                    if ( digit.matches( CompositionClassInterface.regexForDigits )) {

                        System.err.println("Digit entered is too large. ");
                    } else {

                        System.err.println("OK, exit. ");
                    }
                }
            }

            System.out.println("Next digit or 'exit'");

        } while (!digit.equals("exit"));

    }

}
