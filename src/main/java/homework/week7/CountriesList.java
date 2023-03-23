package homework.week7;

import java.util.ArrayList;
import java.util.List;

public class CountriesList {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");
        for (String text : countries) {
            System.out.println(text + "," + " ");
        }
        for (int counter = 0; counter < countries.size(); counter++) {
            if (countries.get(counter).length() > 7) {
                System.out.println(counter++);
            }
        }
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
