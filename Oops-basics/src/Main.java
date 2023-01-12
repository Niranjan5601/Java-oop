import javafx.scene.SubScene;

import javax.security.auth.Subject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student stud = new Student();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter student name: ");
        stud.name = sc.nextLine();
        System.out.println("Enter student roll number: ");
        stud.roll_no = sc.nextInt();

        while(i<4){
            System.out.println("Enter "+stud.subs[i]+" mark");
            stud.marks[i] = (int)(sc.nextInt());
            i++;
        }
        stud.display();

    }

}
class Student  {
    String name ;
    int roll_no;
    String [] subs = {"maths","science","social science","english"};
    String [] grades = {"A+","A","B+","B","C","F"};
    int[] marks = new int[4];
    String [] stud_grades = new String[4];

    Map<String,Integer> sub_points = new HashMap<>();
    int [] points = {5,3,4,3};

    Map<String,Integer> grade_points = new HashMap<>();
    int[] g_points = {5,4,3,2,1,0};



    void display(){
        System.out.println("---------------------------");
        System.out.println("Name: "+this.name);
        System.out.println("Roll number: "+this.roll_no);
        System.out.println("----Marks----");
        display_marks();
        get_gpa();
    }


    void display_marks(){
        grades_store(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(subs[i]+"\t"+marks[i]+"\t"+ stud_grades[i]);
        }
    }




    void grades_store (int[] marks) {

        for (int j = 0; j < marks.length; j++) {


            if (marks[j] >= 90) {
                this.stud_grades[j] = "A+";

            } else if (marks[j] >= 80 && marks[j] < 90) {
                this.stud_grades[j] = "A";
            } else if (marks[j] >= 70 && marks[j]< 80) {
                this.stud_grades[j] ="B+";
            } else if (marks[j] >= 60 && marks[j] < 70) {
                this.stud_grades[j] = "B";
            }
            else if (marks[j] >= 50 && marks[j] < 60) {
                this.stud_grades[j] = "C";
            }
            else {
                this.stud_grades[j] = "F";
            }
        }


}


void get_gpa(){
    for (int i = 0; i < subs.length; i++) {
        sub_points.put(subs[i],points[i]);
    }

    for (int i = 0; i <grades.length; i++) {
        grade_points.put(grades[i],g_points[i]);
    }

    for (int i = 0; i < stud_grades.length ; i++) {
        
    }




}




}



