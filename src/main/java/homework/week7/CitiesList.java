package homework.week7;

import java.util.ArrayList;
import java.util.List;

public class CitiesList {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");
        for (String text : cities) {
            System.out.println(text);
        }
        int coutner = 0;
        for (String text : cities) {
            coutner = coutner + text.length();
        }
        System.out.println(coutner);
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}
