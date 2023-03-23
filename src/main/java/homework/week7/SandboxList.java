package homework.week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SandboxList {
    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();
        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));
        for (Sand massa : sandbox) {
            System.out.print(massa.getWeight() + " ");
        }
        System.out.println();
        for (Sand text : sandbox) {
            System.out.print(text.getName() + " ");
        }
        Map<Integer, Sand> karta = new HashMap<>();
        karta.put(1, new Sand(2, "Речной"));
        karta.put(2, new Sand(4, "Речной"));
        karta.put(3, new Sand(2, "Карьерный"));
        karta.put(4, new Sand(7, "Речной"));
        System.out.println();
        for (Integer key : karta.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
        for (Sand weight : karta.values()) {
            System.out.print(weight.getWeight() + " ");
        }
        System.out.println();
        for (Map.Entry<Integer, Sand> value : karta.entrySet()) {
            System.out.println("Key - " + value.getKey() + "; Values = " + value.getValue());
        }
    }
}

