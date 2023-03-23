package homework.week7;

import java.util.ArrayList;
import java.util.List;

public class ButterfliesList {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");
        for (String text : butterflies) {
            System.out.println("\"" + text + "\"");
        }
        int counter = 0;
        for (String text : butterflies) {
            if (text.contains("o")) {
                counter++;
            }
        }
        System.out.println("Букву О содержит - " + counter + " бабочки");
        for (String text : butterflies) {
            System.out.print(text + " ");
        }
        for (String text : butterflies) {
            System.out.println("\n" + text);
        }
    }
}
