package Classwork.day3;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        String mama = "мама мыла раму мыла";
        String[] array = mama.split("");
        for (String text : array) {
            myList.add(text);
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        for (String text : myList) {
            System.out.println(text);
        }

    }
}
