package myfirst.lesson3.day2;

public class EndOfLineDemo {

/**
 *  JavaDoc style
 *
 *
 * */

    public static void main(String[] args) {

        String lines[];

        // 1
        System.out.println( "1 Hello world\n1 Hello world" );

        // 2
        System.out.println( "2 Hello world" );
        System.out.println( "2 Hello world" );

        // 3
        for ( int i = 0; i <= 1; i++ ) {
            System.out.println("3 Hello world");

            /* System.out.println( i ); */
            // System.out.println( i );

            System.out.println( "End" ); // i );
        };

        int i = 0;
        // 4
        do  {
            System.out.println("4 Hello world");
            i++;
        } while ( i > 1 );

        i = 0;
        // 5
        while ( i <= 1) {
            System.out.println("5 Hello world");
            i++;
        }

        // 6
        lines = new String[2];
        lines[0] = "Hello world";
        lines[1] = lines[0];

        for ( i = 0; i <= 1; i++ ) {

            if ( i == 1 ) {
                System.out.println(lines[i] + "\n");
            } else
                System.out.println(lines[i]);

        }
    }
}
