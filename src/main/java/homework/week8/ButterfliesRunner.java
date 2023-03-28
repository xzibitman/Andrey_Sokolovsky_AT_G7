package homework.week8;

import java.util.ArrayList;
import java.util.List;


public class ButterfliesRunner {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");
        butterflies.stream().map(x -> "\"" + x + "\"").filter(c -> c.contains("a") && c.contains("o")).forEach(System.out::println);
    }
}
