package FileHandling;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws Exception{
        PrintWriter t = new PrintWriter("./src/FileHandling/pw.txt");
        t.write(100);
        t.println(100);
        t.print(true);
        t.println("Helllo");
        t.flush();
        t.close();


    }
}
