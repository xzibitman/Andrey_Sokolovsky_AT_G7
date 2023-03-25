package homework.week7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FurnitureList {
    public static void main(String[] args) {
        List<Chair> furniture = Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4));
        for (Chair value : furniture) {
            int i;
            i = (value.getHeight() * value.getWidth());
            System.out.print(i + " ");
        }
        System.out.println();
        Map<Integer, Chair> mebel = new HashMap<>();
        for (int i = 0; i < furniture.size(); i++) {
            mebel.put(i, furniture.get(i));
        }
        for (Integer key : mebel.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
        for (Chair values : mebel.values()) {
            System.out.println(values);
        }
        System.out.println();
        for (Map.Entry<Integer, Chair> mix : mebel.entrySet()) {
            System.out.println("Key - " + mix.getKey() + "; Values = " + mix.getValue());
        }
    }
}
