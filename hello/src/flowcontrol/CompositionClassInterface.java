package flowcontrol;

interface CompositionClassInterface {

    final public String regexForRangeDigits = "\\b(0|0?[1-9]|[12][0-9])\\b";

    final public String regexForDigits = "\\d+";

    final public String regexForLowLetters = "^[ a-z]+$";

    final public static String[] single_digits = new String[]{ "", "one",
            "two", "three", "four",
            "five", "six", "seven",
            "eight", "nine", "zero" };

    final public static String[] two_digits = new String[]{"ten", "eleven", "twelve",
            "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty"};

    public String digitAsWord( final String digit );

}
