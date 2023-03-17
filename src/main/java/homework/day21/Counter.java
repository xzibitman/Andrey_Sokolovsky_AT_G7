package homework.day21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("file_for_test.txt"));
        String line;
        int count1 = 0;
        while ((line = in.readLine()) != null) {
            String[] find = line.split("");
            int count = 0;
            for (int i = 0; i < find.length; i++) {
                if (find[i].matches("[\\s]")) {
                    count++;
                }
            }
            count1 += count;
        }
        System.out.println(("Сумма знаком препинания = " + count1));
        in.close();

        BufferedReader in2 = new BufferedReader(new FileReader("file_for_test.txt"));
        String line2;
        int count3 = 0;
        while ((line2 = in2.readLine()) != null) {
            String[] find2 = line2.split("[\\d\\s]");
            int count2 = 0;
            for (int i = 0; i < find2.length; i++) {
                count2++;
            }
            count3 += count2;
        }
        System.out.println("Сумма слов = " + count3);
        in.close();

    }
}




