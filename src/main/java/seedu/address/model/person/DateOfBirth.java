package seedu.address.model.person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateOfBirth {
    private final LocalDate dateOfBirth;

    /**
     * Constructs an {@code DateOfBirth}.
     *
     * @param date A valid email address.
     */
    public DateOfBirth(String date) throws IllegalArgumentException {
        if (date.length() == 0) {
            throw new IllegalArgumentException("Date is incorrect.");
        }

        try {
            this.dateOfBirth = LocalDate.parse(date);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Date is incorrect.");
        }
    }

    @Override
    public String toString() {
        return this.dateOfBirth.format(DateTimeFormatter.ofPattern("MM dd yyyy"));
    }

}
