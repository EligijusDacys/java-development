package myfirst.lesson3.day1;

public class BoolArithmeticsTest {

    public static void main(String[] args) {

        boolean exitNow = true;

        boolean doNotExit = false;

        boolean allTrue = true;

        System.out.println("New || value: " + (exitNow || doNotExit) );

        System.out.println("New | value: " + (exitNow | doNotExit) );

        System.out.println("New && value: " + (exitNow && doNotExit) );

        System.out.println("New & value: " + (exitNow & doNotExit) );

        System.out.println("New [true &&] value: " + (exitNow && allTrue ) );

        System.out.println("New [true &] value: " + (exitNow & allTrue ) );

        System.out.println( "\nOR:\n" );
        // Logic boolean OR: || (when we have "double" op
        if ( exitAsFalse() || exitAsTrue() || exitAsTrue() ) {

            System.out.println( "EXIT as TRUE" );
        } else {
            System.out.println( "EXIT as FALSE" );
        }

        System.out.println( "\nAND:\n" );

        // Logic boolean AND: && (when we have "double" op
        if ( exitAsFalse() && exitAsTrue() && exitAsTrue() ) {

            System.out.println( "EXIT as TRUE" );
        } else {
            System.out.println( "EXIT as FALSE" );
        }
    }

    static boolean exitAsTrue() {
        System.out.println("Exit as true" );
        return true;
    };

    static boolean exitAsFalse() {
        System.out.println("Exit as false" );
        return false;
    };

}
