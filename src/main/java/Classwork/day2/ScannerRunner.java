package Classwork.day2;

import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equalsIgnoreCase("hey")) {
                break;
            }
            System.out.printf("Just got '%s' text!", incoming);
        }

    }
}
