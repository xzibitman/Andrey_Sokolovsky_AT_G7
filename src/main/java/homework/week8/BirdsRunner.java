package homework.week8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsRunner {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        Arrays.stream(birds.stream().map(x -> x.replace("о", "а"))
                        .collect(Collectors.joining())
                .toLowerCase()
                .replaceAll("ь", "")
                .split("б"))
                .map(x -> "--" + x + "--")
                .forEach(System.out::println);
    }
}
