package Loops;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        if (i<10){
            System.out.println("the value is less than 10");
        } else if (i == 10) {
            System.out.println("the value is 10");
        }
        else {
            System.out.println("the value is greater than 10");
        }

    }
}
