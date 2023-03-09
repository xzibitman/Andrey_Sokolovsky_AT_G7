package homework.day14;

public class NoStaticNumbersInText {
    public static void findNumbers(String str) {
        String[] find = str.split("");
        int counter = 0;
        for (int i = 0; i < find.length; i++) {
            if (find[i].matches("[0-9]")) {
                counter++;
            }
        }
        int[] array = new int[counter];
        int j = 0;
        for (int i = 0; i < find.length; i++) {
            if (find[i].matches("[0-9]")) {
                array[j++] = Integer.parseInt(find[i]);
            }
        }
        for (int k = 0; k < array.length; k++) {
            System.out.printf(array[k] + " ");
        }
    }

}
