package homework.week7;

import java.util.Arrays;
import java.util.List;


public class DoublesList {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        for (Double fractional : doubles) {
            System.out.print(fractional + " ");
        }
        double result = doubles.stream()
                .reduce((d1, d2) -> d1 * d2).get();
        System.out.println("\n" + "Произведение = " + result);
        int sum = doubles.stream().mapToInt(Double::intValue).sum();
        System.out.println("Сумма = " + sum);
        for (int i = 0; i < doubles.size(); i++) {
            System.out.print(doubles.get(i) + " ");
        }
    }
}