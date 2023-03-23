package homework.week7;

import java.util.Arrays;
import java.util.List;

public class BubblesList {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));
        for (Bubble volume : bubbles) {
            System.out.print(volume.getVolume() + " ");
        }
        System.out.println(" ");
        for (Bubble name : bubbles) {
            System.out.print(name.getName() + " ");
        }
        int sumValue = 0;
        for (Bubble volume : bubbles) {
            sumValue = sumValue + volume.getVolume();
        }
        System.out.println("\n" + "Сумма объемов = " + sumValue);
        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}