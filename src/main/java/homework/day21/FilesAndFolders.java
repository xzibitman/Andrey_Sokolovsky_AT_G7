package homework.day21;

import java.io.File;

public class FilesAndFolders {

    public static void main(String[] args) {

        File dir = new File("/home/default/course/idea-IC-223.8617.56");
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                System.out.println(item.getName());
            }
        }
    }
}
