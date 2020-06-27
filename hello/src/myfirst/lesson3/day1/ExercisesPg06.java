package myfirst.lesson3.day1;

public class ExercisesPg06 {

    public static void main(String[] args) {
        print_digit( 1, 0 );
        System.out.println();
        print_digit( 2, 1, 2 );
        System.out.println();
        print_digit( 3, 1, 2, 2 );
        System.out.println();
        print_digit( 2, 5,5 );
        print_digit( 3, 5,5,5 );
        print_digit( 5, 5,5,5,5,5 );

        System.out.println();
        print_float( 2, "%.4f\n",5.9, Math.E );

    }

    public static void print_digit( int n, Number ... values ) {

        final String literal = "%d";
        StringBuilder builder = new StringBuilder();

        int i = 0;
        do  {
            builder.append( literal );
            i++;

        } while ( i < n );

        System.out.printf( builder.toString(), values );
    }

    public static void print_float( int n, String literal, Double ... values ) {

        StringBuilder builder = new StringBuilder();

        int i = 0;
        do  {
            builder.append( literal );
            i++;

        } while ( i < n );

        System.out.printf( builder.toString(), values );
    }
}