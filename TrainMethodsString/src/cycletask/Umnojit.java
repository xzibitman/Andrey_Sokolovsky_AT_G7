package cycletask;

import java.util.Random;

public class Umnojit {
    public void umnoj() {
        Random random = new Random();
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(7);
        }
        for (int i : array) {
            System.out.println(i * 5);
        }

    }

}
