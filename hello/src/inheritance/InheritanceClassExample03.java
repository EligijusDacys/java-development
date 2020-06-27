package inheritance;

import flowcontrol.composition.CompositionClassInterface;

import java.util.Random;

public class InheritanceClassExample03 implements CompositionClassInterface {

    public static void main(String[] args) {

        InheritanceClassExample03 classExample03 = new InheritanceClassExample03();
        Random randomsForTest = new Random();

        for ( int i = 1; i < 100; i++ ) {

            final Integer nextInt = randomsForTest.nextInt(99 * i);
            System.out.printf( "%d (%s)\n",
                    nextInt,
                    classExample03.digitAsWord( Integer.toString( nextInt ) ) );
        }
    }

    @Override
    public String digitAsWord(String digits) {

        Integer number = Integer.parseInt( digits );

            String word = "";
            int index = 0;
            do {
                // take 3 digits in each iteration
                int num = (int)(number % 1000);
                if (num != 0){
                    String str = uptoThreeDigits(num);
                    word = str + placeholder_values[index] + word;
                }
                index++;
                // next 3 digits
                number /= 1000;
            } while (number > 0);
            return word;
        }

    private String uptoThreeDigits(int number) {

        StringBuilder asWord = new StringBuilder("");

        int num = number % 100;
        if (num < 10) {
            asWord.append( single_digits[num] );
        }
        else if (num < 20) {
            asWord.append( two_digits[ num % 10] );
        } else{
            asWord.append( ten_values[num/10] + single_digits[num%10] );
        }

        asWord = new StringBuilder(
                (number/100 > 0)? single_digits[number/100] + " hundred" + asWord.toString() :
                        asWord.toString() );

        return asWord.toString();
    }

}
