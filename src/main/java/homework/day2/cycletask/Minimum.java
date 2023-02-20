package homework.day2.cycletask;

import java.util.Random;


public class Minimum {
    public void minim() {
        Random random = new Random();
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(7);

        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            System.out.println(min);
        }

    }
}
