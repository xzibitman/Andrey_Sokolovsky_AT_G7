package homework.week8;

import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {
        Stream.of("Андора", "Португалия", "Англия", "Замбия").filter(x -> x.contains("у") || x.contains("е") ||
                        x.contains("ы") || x.contains("а") || x.contains("о") || x.contains("э") || x.contains("я") || x.contains("и") || x.contains("ю"))
                .filter(x -> x.length() < 7)
                .map(String::toUpperCase)
                .map(x -> "\"" + x + "\"")
                .forEach(System.out::println);
    }
}
