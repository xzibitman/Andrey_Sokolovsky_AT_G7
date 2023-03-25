package homework.week7;

import java.util.Arrays;
import java.util.List;

public class WaterList {
    public static void main(String[] args) {
        List<Water> water = Arrays.asList(new Water("Прозрачная", "нет"), new Water("Прозрачная", "нет"), new Water("Мутная", "Аммиачный"));
        for (Water text : water) {
            System.out.println(text.getColor() + " - " + text.getSmell());
        }
    }
}
