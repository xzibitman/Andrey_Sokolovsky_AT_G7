package homework.week7;

import java.util.ArrayList;
import java.util.List;

public class ElementsList {
    public static void main(String[] args) {
        List<String> elements = new ArrayList();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");
        for (String text : elements) {
            System.out.print(text + " ");
        }
        int counter = 0;
        for (String text : elements) {
            String[] array = text.split("[\\s\\d\\p{P}]");
            if (array.length > 1) {
                counter++;
            }
        }
        System.out.println("\n" + "Элементов содержащих больше 2 слов = " + counter);
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");

        }
        System.out.println(" ");
        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");
        for (String text : elements) {
            System.out.print(text + " ");
        }
    }
}