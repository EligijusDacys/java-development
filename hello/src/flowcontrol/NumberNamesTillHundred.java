package flowcontrol;
import flowcontrol.composition.CompositionClassInterface;

/*

----------------
 Class diagram:
----------------

[NumberNames09Class]

    [NumberNames30Class]

      [NumberNamesTillHundred]

*/

// TODO: inheritance to reuse
public class NumberNamesTillHundred extends NumberNames30Class {

    // Now initialized as NumberNames30Class
    public NumberNamesTillHundred(String digit) {
        super(digit);
    }

    final protected String[] tens_digits = new String[] {

            // These cases are covered by the upper classes in hierarchy
            "", "", "",
            "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

    @Override // Let's redefine behaviour: create a generalized case for range [30-99]
    public String digitAsWord() {

            if ( digit.matches( CompositionClassInterface.regexForRangeDigits ) ) {
                return super.digitAsWord();

            } else {

                String regexForDigits = String.format( regexForExtendedRangeDigitsTemplate, digit.charAt( 0 ) );

                if ( digit.matches( regexForDigits ) ) {

                    // Let's apply indexing instead
                    return tens_digits[ Integer.parseInt( digit.substring(0,1) ) ] +
                            " " + CompositionClassInterface.single_digits[(digit.charAt(1) - '0')];

                }
            }

            // Defaulted return
            return new String();
    }

}
