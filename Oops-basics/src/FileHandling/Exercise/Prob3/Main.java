package FileHandling.Exercise.Prob3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

//Compare text from second file , delete them and add it to a new file
public class Main {
    public static void main(String[] args)throws Exception {
        PrintWriter pw = new PrintWriter("./src/FileHandling/Exercise/Prob3/file3.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("./src/FileHandling/Exercise/Prob3/file1.txt"));
        String line = br1.readLine();
while (line!=null){
    boolean avail = false;
    BufferedReader br2 = new BufferedReader(new FileReader("./src/FileHandling/Exercise/Prob3/file2.txt"));
        String line2= br2.readLine();
        while (line2!=null){
            if (line.equals(line2)){
                avail=true;
                break;
            }
            line2=br2.readLine();
        }
        if (avail == false){
            pw.println(line);
        }
        line= br1.readLine();
}
pw.flush();
br1.close();
    }
}
