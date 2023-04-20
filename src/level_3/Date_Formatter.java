package level_3;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Date_Formatter {
    public static int getAge(String dob) {
        LocalDate now = LocalDate.now();
        LocalDate dobDate = formatToDate(dob);
        return Period.between(dobDate, now).getYears();
    }

    public static String format(String date) {
        LocalDate dobDate = formatToDate(date);
        return SimpleDateFormat.getDateInstance(SimpleDateFormat.FULL).format(Date.valueOf(dobDate));
    }

    private static LocalDate formatToDate(String date) {
        String[] dobParts = date.split("/");
        if (dobParts.length < 3) throw new IllegalArgumentException("Incorrect date format");

        int[] dobInts = Arrays.stream(dobParts).mapToInt(Integer::parseInt).toArray();
        return LocalDate.of(dobInts[2], dobInts[1], dobInts[0]);
    }
}