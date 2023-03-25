package Classwork.day4.SecondPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConveerClass {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        int count = 0;
        for (String text : list) {
            if ("мама".equals(text)) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println(list.stream().findFirst().orElse("мама"));
        System.out.println(list.stream().filter("мама"::equals).findFirst().get());
        System.out.println(list.stream().skip(4).findFirst().get());
        System.out.println(list.stream().skip(2).limit(2).collect(Collectors.toList()));
        System.out.println(list.stream().distinct().filter(x -> x.contains("м")).collect(Collectors.toList()));
    }
}