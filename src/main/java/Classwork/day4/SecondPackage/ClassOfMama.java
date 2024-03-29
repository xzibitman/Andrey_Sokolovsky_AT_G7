package Classwork.day4.SecondPackage;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassOfMama {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        System.out.println(list.stream().anyMatch("мама"::equals));
        System.out.println(list.stream().allMatch(x->x.contains("м")));
        System.out.println(list.stream().map(x->x + "м ").collect(Collectors.joining()));
        System.out.println(list.stream().flatMap(x-> Arrays.stream(x.split("а"))).filter(x->!x.isEmpty()).collect(Collectors.joining()));
    }
}
