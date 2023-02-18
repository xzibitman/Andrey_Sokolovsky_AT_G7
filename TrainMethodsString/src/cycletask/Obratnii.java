package cycletask;

import java.util.Random;

public class Obratnii {
    public void obrat() {

        Random random = new Random();
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(7);
        }

        for (int i = array.length - 1; i >= 0; i--)
            System.out.println(i);
    }

}

