package minimax;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import static java.lang.Math.*;

/**
 * Minimum and maximum, comparison, search in array
 */

class MinMaxArray {

    static int[] array = {48, 20, 52, 19, 14, 17, 35,

            generate_random_int(1, 100),
            generate_random_int(1, new Random().nextInt(299)),
            generate_random_int(new Random().nextInt(20), new Random().nextInt(300))

    };

    // Method to find maximum in array[]
    static int largest() {
        int i;

        // Take the max is the first
        int max = array[0];

        // Iterate array elements from *second* and compare
        for (i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];

        return max;
    }

    // Method to find minimum in array[]
    static int smallest() {
        int i;

        // Take the min is the first
        int min = array[0];

        // Iterate array elements from *second* and compare
        for (i = 1; i < array.length; i++)
            if (array[i] < min)
                min = array[i];

        return min;
    }

    // Method to find minimum in array[]
    static int comparing(boolean minmax) {
        int i;

        // Take the min is the first
        int cmp = array[0];

        // Iterate array elements from *second* and compare
        for (i = 1; i < array.length; i++)

            if (minmax) {
                if (array[i] <= cmp)
                    cmp = array[i];

            } else {

                if (array[i] >= cmp)
                    cmp = array[i];
            }

        return cmp;
    }

    private static int generate_random_int(int min, int max) {

        Random r = new Random();
        try {
            return r.nextInt((max - min) + 1) + min;

        } catch ( IllegalArgumentException e ) {

            // The minimum length for a String
            return 1;
        }
    }

    public static String generate_random_string(int length) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = length; i > 0; i -= 12) {
            int n = min(12, abs(i));

            stringBuilder.append( Long.toString(round(random() * pow(36, n)), 36) );
        }

        String toReturn = stringBuilder.toString().replaceAll("\\d", "a");

        stringBuilder = new StringBuilder();

        int idx;
        for (int i = 0; i < toReturn.length(); i++) {

            char c = toReturn.charAt(i);
            idx = toReturn.indexOf(c, i + 1);
            if (idx == -1) {
                stringBuilder.append( Character.toUpperCase( c ) );
            } else {
                stringBuilder.append( Character.toLowerCase( c ) );
            }
        }

        toReturn = stringBuilder.toString();

        System.out.println( toReturn );

        return toReturn;
    }


    public static String find_longest_string( String[] array ) {

        int maxLength = 0;
        String longestString = new String();

        // Different, iterating for !!
        for (String stringElement : array) {

            if (stringElement.length() > maxLength) {
                maxLength = stringElement.length();
                longestString = stringElement;
            }
        }
        return longestString;
    }


    public static String[] sort_strings_alpha(final String[] strings) {

        String temp = "";

        // Old style traverse
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {

                if ( strings[i].compareTo(strings[j]) > 0 ) {
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        return Arrays.copyOf( strings, strings.length );
    }


    public static String[] sort_strings_length(final String[] strings) {

        String temp = "";

        // New style traverse, also different comparison
        Iterator<String> iStrings = Arrays.asList( strings ).iterator();
        iStrings.next();

        for ( int i = 0; iStrings.hasNext(); i++, iStrings.next() ) {
            for (int j = i + 1; j < strings.length; j++) {

                if ( strings[i].length() > strings[j].length() ) {
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        return Arrays.copyOf( strings, strings.length );
    }


    // Run method
    public static void main(String[] args) {

        String string_array[] = new String[ 10 ];
        for ( int i = 0; i < string_array.length; i++ ) {

            string_array[i] = generate_random_string( generate_random_int(1, 32) );
        }

        System.out.println("\nString generated: " + Arrays.deepToString( string_array ));

        System.out.println("\nStrings sorted by length: " + Arrays.deepToString( sort_strings_length( string_array ) ));

        System.out.println("\nStrings sorted alphabetically: " + Arrays.deepToString( sort_strings_alpha( string_array ) ));

        System.out.println("\nLongest string in array: " + find_longest_string( string_array ) );

        System.out.println("\nArray generated: " + Arrays.toString(array) + "\n");

        System.out.println("Largest in given array is " + largest() + " and smallest is " + smallest());

        System.out.println("Comparing by values in array: largest is " +
                comparing(false) + " " +
                "and smallest is " +
                comparing(true));

    }
}
