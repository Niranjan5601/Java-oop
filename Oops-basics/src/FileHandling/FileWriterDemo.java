package FileHandling;

import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) throws Exception {
        FileWriter f = new FileWriter("./src/FileHandling/pad.txt");
       f.write("daddwawd \n");

       f.write(100);
        char[] l = {'a','p','p','l','e'};
        f.write(l);
       f.flush();
       f.close();
    }
}
