package myfirst.lesson2.day2;

public class StringsCompared {

    public static void main(String[] args) {

        // All string data is "Tom"
        String s1 = new String("Tom");
        String s2 = new String("Tom");

        String s3 = "Tom";
        String s4 = "Tom";

        // it is not what it seems
        System.out.println( "s1 == s2 : " + ( s1 == s2 ) );

        // Error in syntax, but IDE does not see it.
        System.out.println( "s1 == s3 : " + s1 == s3 );

        System.out.println( Boolean.valueOf( s3 == s4 ).toString() + " s3 compare as literal s4" );

        // Lets do an actual data comparison: i.e content
        System.out.println( "s1 == s2 : " + s1.equals( s2 ));
        System.out.println( "s1 == s3 : " + s1.equals( s3 ));
        System.out.println( "s3 == s4 : " + s3.equals( s4 ));

        // String data is "Tom", altered
        String s5 = new String("ToM");

        System.out.println( "s1 == s5 : " + ( s1 == s5 ) );
        System.out.println( "s1 == s5 as content : " + s1.equals( s5 ));

        System.out.println( "s1 == s5 as ignored case content : " + s1.equalsIgnoreCase( s5 ));

        // Literal
        final String azSample = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println( azSample.toLowerCase() );

        StringBuilder stringBuilder = new StringBuilder();

        for ( int i = 0; i < azSample.length(); i++ ) {

            // Single char case to lowercase
            stringBuilder.append( Character.toLowerCase( azSample.charAt( i ) ));
        }

        System.out.println( "OUT: " + stringBuilder.reverse().toString() );
    }
}
