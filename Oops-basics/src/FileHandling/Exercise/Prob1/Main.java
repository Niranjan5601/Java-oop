package FileHandling.Exercise.Prob1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

//write a program to merge data from two files into third file
public class Main {
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter("./src/FileHandling/Exercise/Prob1/file3.txt");
        BufferedReader br = new BufferedReader(new FileReader("./src/FileHandling/Exercise/Prob1/file1.txt"));
        String line = br.readLine();
        while (line!=null){
            pw.println(line);
            line = br.readLine();
        }

        br=  new BufferedReader(new FileReader("./src/FileHandling/Exercise/Prob1/file2.txt"));
        line = br.readLine();
        while (line != null){
            pw.println(line);
            line = br.readLine();
        }
        pw.flush();
        br.close();
    }
}
