package FileHandling.Exercise.Prob2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

//write a program to merge data from two files into a third file where merging happens alternatively
public class Main {
    public static void main(String[] args)throws  Exception {
        PrintWriter pw = new PrintWriter("./src/FileHandling/Exercise/Prob2/file3.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("./src/FileHandling/Exercise/Prob2/file1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("./src/FileHandling/Exercise/Prob2/file2.txt"));
        String line1 = br1.readLine();
        String line2 = br2.readLine();
        while ((line1!=null)|| (line2!=null)){
            if (line1!=null){
                pw.println(line1);
                line1=br1.readLine();
            }
            if (line2!=null){
                pw.println(line2);
                line2=br2.readLine();
            }
        }
        pw.flush();
        br1.close();
        br2.close();

    }
}
