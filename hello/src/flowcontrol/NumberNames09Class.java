package flowcontrol;

// You can still use constants from Composition interface!
import static flowcontrol.composition.CompositionClassInterface.single_digits;
import inheritance.InheritedClassInterface;

public class NumberNames09Class implements InheritedClassInterface {

    // Class variable, see encapsulation
    protected String digit;

    public NumberNames09Class( final String digit ) {

        // Initialize private class variable
        this.setDigit(digit);
    }

    @Override
    public String digitAsWord( ) {

        System.out.println("Enter NumberNames09Class::digitAsWord" );

            /* For single digit number: digit is this.digit now */
            if ( digit.length() == 1) {

                if (digit.charAt(0) - '0' > 0) {

                    return single_digits[digit.charAt(0) - '0'];

                } else {

                    return single_digits[single_digits.length - 1];
                }
            } else
                return new String("");
    }

    // Getters
    public String getDigit() {
        return digit;
    }

    // Setters
    public void setDigit(String digit) {
        this.digit = digit;
    }

    public static void main(String[] args) {

        NumberNames09Class numberNames09Class =
                new NumberNames09Class( "" );

        for ( int i = 0; i < 10; i++ ) {

            numberNames09Class.setDigit( Integer.toString( i ) );
            System.out.println( numberNames09Class.digitAsWord() );
        }

    }

}
