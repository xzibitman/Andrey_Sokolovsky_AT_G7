package cycletask;

import java.util.Random;

public class Mesta {
    public void Mest() {
        Random random = new Random();
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(7);
        }
        int i = array[0];
        array[0] = array[6];
        array[6] = i;
        System.out.println(array[0]);
        System.out.println(array[6]);
    }

}

