package Classwork.day3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        String mama = "мама мыла раму мыла";
        String[] array = mama.split("[\\s]");
        for (String text : array) {
            mySet.add(text);
        }

        for (String text : mySet) {
            System.out.println(text);
        }
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
