package myfirst.lesson1.day2;

public class Exercise2 {

    /* This is the entry point */
    public static void main ( String [ ] args ) {

        int a = 15, b = 25;

        // Temporary // save it // Scope demo: c

        System.out.println("BEFORE: a = " + a + " b = " + b);
        // System.out.println("Initialized : c = " + c + "\n");

        // Change values: minimal scope
        {
        int c = a;
        a = b;
        b = c;
        }

        System.out.println( "AFTER: a = " + a + " b = " + b );
    }
}
