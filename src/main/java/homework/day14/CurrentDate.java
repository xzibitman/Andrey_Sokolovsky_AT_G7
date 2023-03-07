package homework.day14;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
    public static void date() {
        DateFormat dateFormat = new SimpleDateFormat("d MMMM, yyyy, HH часа mm минут");
        String date = dateFormat.format(new Date());
        System.out.println("Сейчас на дворе: " + date);
    }
}
