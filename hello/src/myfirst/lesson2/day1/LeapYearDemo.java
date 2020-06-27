package myfirst.lesson2.day1;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class LeapYearDemo {

    public static void main(String[] args) {

        int year = 1;
        do {

            if (year >= 1583) {

                // get the supported ids for GMT-08:00 (Pacific Standard Time)
                String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
                // if no ids were returned, something is wrong. get out.
                if (ids.length == 0)
                    System.exit(0);

                // begin output
                System.out.println("Current Time");

                // create a Pacific Standard Time time zone
                SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);

                // set up rules for Daylight Saving Time
                pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
                pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);

                // create a GregorianCalendar with the Pacific Daylight time zone
                // and the current date and time
                Calendar calendar = new GregorianCalendar(pdt);

                System.out.println( "Calendar  " + calendar.toString() + " created " );

                // Danger: year++ and ++year
                System.out.printf("Year %d is a leap: %s\n", ++year,

                        isLeapYear(year) &&  // Yes it is double &&, but works with single & too
                        Year.of(year).isLeap());
            } else {
                System.out.println(String.format("%s", year++));
            }

            // year++;

        } while (year <= java.time.Year.now().getValue());
    }

    public static boolean isLeapYear(int year) {
        assert year >= 1583; // not valid before this date.
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}
