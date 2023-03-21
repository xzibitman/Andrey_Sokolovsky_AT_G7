package homework.week7;

import java.util.Arrays;
import java.util.List;

public class FiguresList {
    public static void main(String[] args) {
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
        for (String text : figures) {
            System.out.print(text + " - "); // удалить последний символ
        }
        int counter = 0;

        for (String text : figures) {
            if (!text.contains("и")) {
                counter++;
            }
        }
        System.out.println(counter);
        try {
            figures.add(3, "Треугольник");
            for (String text : figures) {
                System.out.println(text + " ");
            }
        } catch (UnsupportedOperationException e) {
            System.out.println("нельзя добавить элемент в Arrays.asList");
        }
        for (String text : figures) {
            System.out.print(text + " ");
        }
    }
}
