


import java.util.*;

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



    Map<String,Integer> sub_points = new HashMap<>();

    int[] marks = new int[4];


    ArrayList<GPA> grade_points = new ArrayList();




    void display(){
        System.out.println("---------------------------");
        System.out.println("Name: "+this.name);
        System.out.println("Roll number: "+this.roll_no);
        System.out.println("----Marks----");
        display_marks();
        
    }


    void display_marks(){


        sub_points.put("maths", 5);
        sub_points.put("science", 4);
        sub_points.put("social science", 3);
        sub_points.put("english", 2);

        grades_store(marks);
        int totalgrade=0;
        int combined=0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println(subs[i]+"\t"+marks[i]+"\t"+ grade_points.get(i).grade);
            combined +=sub_points.get(subs[i])*grade_points.get(i).score;
            totalgrade=totalgrade+sub_points.get(subs[i]);
        }
        int total =combined/totalgrade;
        System.out.println("GPA of the student is: \t" + total);
    }




    void grades_store (int[] marks) {

        for (int j = 0; j < marks.length; j++) {

            GPA gpa;
            if (marks[j] >= 90) {
                gpa=new GPA("A+",5);
            } else if (marks[j] >= 80 && marks[j] < 90) {
                 gpa=new GPA("A",4);
            } else if (marks[j] >= 70 && marks[j]< 80) {
                  gpa=new GPA("B+",3);
            } else if (marks[j] >= 60 && marks[j] < 70) {
                  gpa=new GPA("B",2);
            }
            else if (marks[j] >= 50 && marks[j] < 60) {
                gpa=new GPA("C",1);
            }
            else {
                gpa=new GPA("F",0);
            }
            grade_points.add(gpa);
        }


}


}



class GPA
{
    String grade;
    int score;



    public GPA(String grade, int score)
    {
        this.grade=grade;
        this.score=score;
    }
}




