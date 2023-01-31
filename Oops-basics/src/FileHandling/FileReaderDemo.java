package FileHandling;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) throws Exception {
//        FileReader f = new FileReader("./src/FileHandling/pad.txt");
//        int i = f.read();
//
//        while (i !=-1){
//            System.out.print((char) i);
//            i=f.read();
//        }

        File f = new File("./src/FileHandling/pad.txt");
        char[] ch = new char[(int)f.length()];
        FileReader fr = new FileReader(f);
        fr.read(ch);
        for (char ch1:ch){
            System.out.print(ch1);
        }
fr.close();


    }
}
