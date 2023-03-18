package Classwork.day3;

import java.util.*;

public class HashAndTree {
    public static void main(String[] args) {
        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList1.add("text" + i);
        }
        long t1 = System.currentTimeMillis() - t0;
        System.out.println("array list time: " + t1);

        t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList2.add("text" + i);
        }
        t1 = System.currentTimeMillis() - t0;
        System.out.println("linked list time: " + t1);
    }
}

