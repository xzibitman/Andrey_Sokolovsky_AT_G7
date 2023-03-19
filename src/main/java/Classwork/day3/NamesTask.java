package Classwork.day3;

import java.util.ArrayList;
import java.util.List;

public class NamesTask {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Маша");
        names.add("Даша");
        for (String text : names) {
            System.out.print(text + " ");
        }
        names.set(2, "Оля");
        names.set(4, "Коля");
        for (String text : names) {
            System.out.print("\n" + text + " ");
        }
        names.remove("Оля");
        names.remove(3);
        System.out.print("\n" + names);
    }
}

