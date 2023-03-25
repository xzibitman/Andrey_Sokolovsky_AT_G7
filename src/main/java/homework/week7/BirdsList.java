package homework.week7;

import java.util.Arrays;
import java.util.List;

public class BirdsList {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        for (String text : birds) {
            System.out.println("--" + text + "--");
        }
        int counter = 0;
        for (String bird : birds) {
            int counterVowels = 0;
            char[] arrayChars = {'у', 'е', 'ё', 'ы', 'а', 'о', 'э', 'я', 'и', 'ю'};
            char[] arrayBirds = bird.toCharArray();
            for (int i = 0; i < arrayBirds.length; i++) {
                for (int k = 0; k < arrayChars.length; k++) {
                    if (arrayBirds[i] == arrayChars[k]) {
                        counterVowels++;
                    }
                }
            }
            if (counterVowels > 1) {
                counter++;
            }
        }
        System.out.println("Птиц с гласными больше одной = " + counter);
        birds.set(3, "Синица");
        for (String text : birds) {
            System.out.print(text + " ");
        }
    }
}


