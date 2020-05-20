package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String REGEX = "^\\([0-9]{2,4}\\)\\-\\(0[0-9]{9,10}\\)$";

    public ValidatePhone() {
        pattern = Pattern.compile(REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
