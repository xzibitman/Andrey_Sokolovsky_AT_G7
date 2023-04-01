package homework.week8;

import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {
        Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb")
                .map(p -> {
                    if (p.length() % 2 == 1) {
                        return p.replace("e", "o");
                    } else {
                        return String.valueOf(p.length());
                    }
                }).distinct().forEach(System.out::println);
    }
}
