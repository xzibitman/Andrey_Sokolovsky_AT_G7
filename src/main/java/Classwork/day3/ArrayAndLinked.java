package Classwork.day3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinked {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList1.add("text");
        }
        long t1 = System.currentTimeMillis() - t0;
        System.out.println("array list time: " + t1);


        t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList2.add("text");
        }
        t1 = System.currentTimeMillis() - t0;
        System.out.println("linked list time: " + t1);
    }
}

