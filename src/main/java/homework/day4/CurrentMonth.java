package homework.day4;

import java.sql.SQLOutput;

public class CurrentMonth {
    public static void main(String[] args) {
        int[] array = new int[]{44, 25, 64, 45, 87, 345, 1};
        int sum = 0;
        int month = 2;
        for (int i : array) {
            if (i % month == 0)
            sum += i;
        }
        System.out.println("Сумма чисел кратных текущему месяцу = " + sum);


    }

}
