package Classwork.day3;

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        String[] array = "мама мыла раму мыла".split(" ");
        Map<Integer, String> words = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }
        for (int i : words.keySet()) {
            System.out.println(i);
        }
        for (String text : words.values()) {
            System.out.println(text);
        }
        for (Map.Entry<Integer, String> value : words.entrySet()) {
            System.out.println(value);
        }
    }
}
