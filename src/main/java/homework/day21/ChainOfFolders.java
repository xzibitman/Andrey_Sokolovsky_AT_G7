package homework.day21;

import java.io.*;


public class ChainOfFolders {
    public static void main(String[] args) throws IOException {
        File derictory = new File("/home/default/test_path/folder1/folder2/folder3");
        if (derictory.mkdirs()) {
            System.out.println("created");
            BufferedWriter out = new BufferedWriter(new FileWriter("/home/default/test_path/folder1/folder2/folder3/new_file.txt"));
            out.write("1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
            BufferedWriter out2 = new BufferedWriter(new FileWriter("/home/default/test_path/folder1/folder2/folder3/new_file2.txt"));
            out2.write("12, 22, 54, 64, 42, 2, 8, 4, 6, 12");
            out.close();
            out2.close();
        }
    }
}
