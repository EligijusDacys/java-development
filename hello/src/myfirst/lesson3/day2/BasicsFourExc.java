package myfirst.lesson3.day2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BasicsFourExc {

    public static void main(String[] args) {

        int val1 = 1132;
        int val2 = 231;

        // Cast integer to double
        double result = (double) (val2 /val1);

        // Construct a double using cast
        Double rslt = new Double( (double) val2 /val1 );

        NumberFormat formated = new DecimalFormat("##.###");
        System.out.println(formated.format(result) + " " + formated.format( rslt ));
        System.out.println(rslt);

        byte[] bytes = new byte[  ] { 10, 55, 22, 33 };

        // Get one and do a cast to integer
        int one = ( int ) bytes[ 1 ];
        System.out.println( one );

    }
}
