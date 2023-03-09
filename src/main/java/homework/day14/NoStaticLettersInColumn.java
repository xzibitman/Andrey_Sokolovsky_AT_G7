package homework.day14;

public class NoStaticLettersInColumn {
    public static void writeLetters(String text) {
        char[] array = text.toCharArray();
        for (char i : array) {
            System.out.println(i);
        }
    }
}
