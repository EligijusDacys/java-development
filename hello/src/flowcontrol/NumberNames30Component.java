package flowcontrol;

// TODO: Use composition or inheritance to reuse

import flowcontrol.composition.CompositionClassInterface;

public class NumberNames30Component implements CompositionClassInterface {

    // Use composition
    private NumberNames09Component numbersTill10;

    // Constructor
    public NumberNames30Component() {

        numbersTill10 = new NumberNames09Component();
    };

    @Override
    public String digitAsWord(String digit) {

        String toReturn = new String();

            if (digit.length() == 2 && digit.charAt(0) == '1') {

            /* Explicitly handle 10-19. Sum of the two digits is used as index of "two_digits"
            array of strings */

                toReturn = CompositionClassInterface.two_digits[digit.charAt(1) - '0'];

            } else if (digit.length() == 2 && digit.charAt(0) == '2') {

                toReturn = CompositionClassInterface.two_digits[two_digits.length - 1] +
                        " " + CompositionClassInterface.single_digits[(digit.charAt(1) - '0')];

            } else if (digit.length() == 1) {

                toReturn = numbersTill10.digitAsWord( digit );

                if (digit.charAt(0) - '0' > 0) {

                    toReturn = CompositionClassInterface.single_digits[digit.charAt(0) - '0'];

                } else {

                    // For zero: take the last in array
                    toReturn = CompositionClassInterface.single_digits[
                            CompositionClassInterface.single_digits.length - 1];
                }

            }

            return toReturn;
    }

}
