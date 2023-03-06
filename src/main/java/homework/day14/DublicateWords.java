package homework.day14;

public class DublicateWords {
    public static void dublicateWords(String text) {
        String[] array = text.split(" ");
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i].equals(array[k])) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
