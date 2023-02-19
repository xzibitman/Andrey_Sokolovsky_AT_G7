package cycletask;

import java.util.Random;

public class Kvadrat {
    public void kvadr() {
        Random random = new Random();
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(7);
        }
        for (int i : array) {
            System.out.println(Math.pow(i, 2));
        }

    }
}
