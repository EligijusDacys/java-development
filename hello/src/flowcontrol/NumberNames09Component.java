package flowcontrol;

import flowcontrol.composition.CompositionClassInterface;

public class NumberNames09Component implements CompositionClassInterface {

    public String digitAsWord( final String digit ) {

            /* For single digit number */
            if (digit.length() == 1) {

                if (digit.charAt(0) - '0' > 0) {

                    return CompositionClassInterface.single_digits[digit.charAt(0) - '0'];

                } else {

                    return CompositionClassInterface.single_digits[single_digits.length - 1];
                }

            } else {
                return new String();
            }
    }

}
