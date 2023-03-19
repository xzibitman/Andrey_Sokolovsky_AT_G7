package Classwork.day3;

import java.util.LinkedList;
import java.util.List;

public class VegetablesTask {
    public static void main(String[] args) {
        List<String> vegetables = new LinkedList<>();
        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");
        for (String text : vegetables) {
            System.out.print(text + " ");
        }
        int counter = 0;

        for (String text : vegetables) {
            if (text.contains("а")) {
                counter++;
            }
        }
        System.out.println(counter);
        for (String text : vegetables) {
            System.out.println(text);
        }
        vegetables.remove("Огурец");
        vegetables.remove(3);
        for (String text : vegetables) {
            System.out.println("без огурца и 3 позиции " + text);
        }
    }
}
