package myfirst.lesson2.day1;
import java.util.Scanner;

public class FizzBuzzDemo {

    public static void main(String[] args){

        int skaicius;
        // Explicit note: in heap only
        { // Scope!!
        Scanner klav = new Scanner(System.in);
        System.out.println("Iveskite sveikaji skaiciu");
        skaicius = klav.nextInt();

        } // Scanner (in the heap) ends here: or gets finalized

        if(skaicius % 15 == 0){
            System.out.println("fizzbuzz");
        }
        if(skaicius % 15 != 0 && skaicius % 3 == 0){
            System.out.println(("fizz"));
        }
        if(skaicius % 15 != 0 && skaicius % 3 != 0 && skaicius % 5 == 0){
            System.out.println("buzz");
        }
        if (skaicius % 3 != 0 && skaicius % 5 != 0) {
            System.out.println("Ivedete ne FIZZBUZZINI skaiciu!");
        }

        /*
        for ( int i = 1; i <= 100; i++ ) {
            if (i%3 == 0 && i%5 == 0)
                System.out.printf( "FizzBuzz %d\n", i );
            else if (i%5 == 0)
                System.out.printf( "Buzz %d\n", i );
            else if (i%3 == 0)
                System.out.printf( "Fizz %d\n", i );
            else
                System.out.println(i);
        } */

    }
}
