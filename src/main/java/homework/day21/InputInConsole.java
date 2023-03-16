package homework.day21;

import java.util.Scanner;

public class InputInConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equalsIgnoreCase(" secret letter ")) {
                break;

            }
            System.out.printf("Hello, I just got %s from you!", incoming);
        }
    }
}
