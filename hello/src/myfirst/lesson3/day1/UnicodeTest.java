package myfirst.lesson3.day1;

import static java.lang.Math.*;

public class UnicodeTest {

    public static void main(String[] args) {

        // https://en.wikipedia.org/wiki/List_of_Unicode_characters
        System.out.println( String.format(
                "Math %s is %f \u00a9" , "\u03C0 ", Math.PI ) );
    }

}
