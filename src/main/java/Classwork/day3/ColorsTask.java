package Classwork.day3;

import java.util.ArrayList;
import java.util.List;

public class ColorsTask {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        for (String text : colors) {
            System.out.print(text + " ");
        }
        colors.add(2, "Pink");
        colors.add(4, "Yellow");
        for (String text : colors) {
            System.out.print("\n" + text + " ");
        }
        System.out.print("\n" + colors.get(1) + " " + colors.get(5));

    }
}
