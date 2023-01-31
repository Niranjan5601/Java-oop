package FileHandling;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        File f1 = new File("./src/FileHandling/abc.txt");
        // f.createNewFile();//to create file
      //  System.out.println("File created");
        File f = new File("./src/FileHandling/");
//        f.mkdir();//to create a folder
//        System.out.println("dir created");
        String[] ls = f.list();
        System.out.println(Arrays.toString(ls));
        System.out.println(f1.length());

    }
}