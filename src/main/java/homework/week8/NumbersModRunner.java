package homework.week8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090).map(String::valueOf).filter(s -> s.contains("3"))
                .flatMap(x -> Arrays.stream(x.split("")))
                .map(x -> {
                    if (Objects.equals(x, "0")) {
                        return "ноль";
                    }
                    if (Objects.equals(x, "1")) {
                        return "один";
                    }
                    if (Objects.equals(x, "2")) {
                        return "два";
                    }
                    if (Objects.equals(x, "3")) {
                        return "три";
                    }
                    if (Objects.equals(x, "4")) {
                        return "четыре";
                    }
                    if (Objects.equals(x, "5")) {
                        return "пять";
                    }
                    if (Objects.equals(x, "6")) {
                        return "шесть";
                    }
                    if (Objects.equals(x, "7")) {
                        return "семь";
                    }
                    if (Objects.equals(x, "8")) {
                        return "восемь";
                    }
                    if (Objects.equals(x, "9")) {
                        return "девять";
                    }
                    return x;
                }).distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
