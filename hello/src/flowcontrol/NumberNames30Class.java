package flowcontrol;

// TODO: inheritance to reuse
public class NumberNames30Class extends NumberNames09Class {

    // Default constructor overload
    public NumberNames30Class() {
        super("");
    }

    // Main constructor
    public NumberNames30Class(String digit) {
        super(digit);
    }

    // Class variable - array
    final protected String[] two_digits = new String[]{ "ten", "eleven", "twelve",
            "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty" };

    @Override // Let's redefine behaviour
    public String digitAsWord() {

        System.out.println( "Enter NumberNames30Class::digitAsWord" );

            if (digit.length() == 1) {
                return super.digitAsWord();

            } else

            if (digit.length() == 2 && digit.charAt(0) == '1') {

            /* Explicitly handle 10-19. Sum of the two digits is used as index of "two_digits"
            array of strings */
                return this.two_digits[digit.charAt(1) - '0'];

            } else if (digit.length() == 2 && digit.charAt(0) == '2') {

                return two_digits[two_digits.length - 1] +
                        " " + NumberNames09.single_digits[(digit.charAt(1) - '0')];

            } else

            // Defaulted return
            return new String();
    }

    public static void main(String[] args) {

        NumberNames30Class numberNames30Class =
                new NumberNames30Class( "" );

        for ( int i = 0; i < 30; i++ ) {

            numberNames30Class.setDigit( Integer.toString( i ) );
            System.out.println( numberNames30Class.digitAsWord() );
        }
    }
}
