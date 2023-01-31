package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("./src/FileHandling/pad.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(65);
        bw.newLine();
        char[] l = {'a','p','p','l','m'};
        bw.write(l);
        bw.newLine();
        bw.write("Hello");
        bw.newLine();
        bw.write("From console");
         bw.flush();
       bw.close();



    }
}
