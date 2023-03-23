package homework.week7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumbersList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);
        for (Integer numeric : numbers) {
            System.out.println(numeric);
        }
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Сумма = " + sum);
        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println(" ");
        Collections.sort(numbers, Collections.reverseOrder());
        for (Integer numeric : numbers) {
            System.out.print(numeric + " ");
        }
    }
}
