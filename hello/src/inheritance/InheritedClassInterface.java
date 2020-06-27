package inheritance;

public interface InheritedClassInterface {

    // Only define new behaviour
    public String digitAsWord();

    public void setDigit(String digit);

    public String getDigit();

    final public String regexForExtendedRangeDigitsTemplate = "\\b(0?[%s][0-9])\\b";

}
