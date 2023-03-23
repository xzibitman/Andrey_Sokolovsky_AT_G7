package homework.week7;

import java.util.ArrayList;
import java.util.List;

public class NoodlesList {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");
        for (String text : noodles) {
            System.out.println("- " + text);
        }
        for (int i = 0; i < noodles.size(); i++) {
            String text = noodles.get(i);
            text = text.replace('a', 'o');
            noodles.set(i, text);
        }
        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}
