package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
    public static void main(String[] args)throws Exception {
        FileReader r = new FileReader("./src/FileHandling/pad.txt");
        BufferedReader br = new BufferedReader(r);
        String line = br.readLine();
        while(line!=null){
            System.out.println(line);
            line = br.readLine();
        }
br.close();

    }
}
