package _20_solid._01_single_responsibility.after;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class StringUtils {
    public static boolean isValidDate(final String date) {

        boolean valid = false;

        try {

            // ResolverStyle.STRICT for 30, 31 days checking, and also leap year.
            LocalDate.parse(date,
                    DateTimeFormatter.ofPattern("dd-MM-uuuu")
                            .withResolverStyle(ResolverStyle.STRICT)
            );

            valid = true;

        } catch (DateTimeParseException e) {
            e.printStackTrace();
            valid = false;
        }

        return valid;
    }

    public static boolean isValidEmail(String emailInput) {
        return emailInput.matches("[A-Z][a-z0-9]+@[a-zA-Z]+.[a-zA-Z]+");
    }
}
