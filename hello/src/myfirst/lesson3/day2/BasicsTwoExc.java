package myfirst.lesson3.day2;

import java.text.DecimalFormat;

public class BasicsTwoExc {

    public static void main(String[] args) {

    double x=123456789.226;
    double y=10.3451;

        DecimalFormat df = new DecimalFormat("#,##0.00;(#,##0.00)" );
        System.out.println( df.format( x ) );

        df = new DecimalFormat(".##" );
        System.out.println( df.format( y ) );

    }



}
