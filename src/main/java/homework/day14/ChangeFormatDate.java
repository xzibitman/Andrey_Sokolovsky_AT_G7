package homework.day14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ChangeFormatDate {
    public static void changeFormat(String oldDate) {
        Locale usLocale = new Locale("en","US");
        LocalDateTime date = LocalDateTime.parse(oldDate, DateTimeFormatter.ofPattern("HH.mm dd.MM.yyyy"));
        System.out.println(date.format(DateTimeFormatter.ofPattern("MMMM, d, yyyy HH:mm", usLocale)));


    }
}
