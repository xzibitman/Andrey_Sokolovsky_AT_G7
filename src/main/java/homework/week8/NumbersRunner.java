package homework.week8;

import java.util.stream.Stream;

public class NumbersRunner {
    public static void main(String[] args) {
        System.out.println(Stream.of(3342,34,79,23426,68,1324,55,7699)
                .peek(System.out::println)
                .sorted()
                .peek(System.out::println)
                .reduce(Integer::sum));
    }
}
