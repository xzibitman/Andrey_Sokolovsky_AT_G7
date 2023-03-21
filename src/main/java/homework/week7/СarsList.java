package homework.week7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class СarsList {
    public static void main(String[] args) throws IOException {
        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");
        try {
            FileWriter writer = new FileWriter("cars.txt", true);
            for (String text : cars) {
                writer.write("- " + "\"" + text + "\"" + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи необходимо проверить данные");
        }
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).length() > 4) {
                cars.remove(i--);
            }
        }
        for (String text : cars) {
            System.out.println(text);
        }
    }
}


