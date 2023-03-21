package homework.week7;

import java.util.Arrays;
import java.util.List;

public class BirdsList {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        for (String text : birds) {
            System.out.println("--" + text + "--");
        }
//        String vowels = "у";     НЕ готово
//        for (String text : birds) {
//            for (int i = 0; i < birds.size(); i++) {
//                switch (text){
//                    case 'у', 'е', 'ы', 'а', 'о', 'э', 'и', 'ю'
//                    System.out.println(i++);
//                }
        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println("");
        birds.set(3, "Синица");
        for (String text : birds) {
            System.out.print(text + " ");
        }
    }
}


