//package homework.day21;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Counter {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader in = new BufferedReader(new FileReader("file_for_test.txt"));
//        String line;
//        while ((line = in.readLine()) != null) {
//            char[] find = {'.', ',', '-', '?', '!', ':', ';'};
//            int count = 0;
//            Scanner scanner = new Scanner("file_for_test.txt");
//            String s = scanner.nextLine();
//            for (int i = 0; i < find.length; i++) {
//                if (find[i].contain('.', ',', '-', '?', '!', ':', ';')) {
//                    count++;
//                    break;
//
//                }
//            }
//        }
//
//        System.out.println(count);
//        System.out.println(line);
//
//        in.close();
//    }
//}



