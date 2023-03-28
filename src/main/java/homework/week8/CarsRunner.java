package homework.week8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarsRunner {
    public static void main(String[] args) {
        Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди").distinct().skip(Long.parseLong("1"))
                .filter(x -> x.contains("и"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
