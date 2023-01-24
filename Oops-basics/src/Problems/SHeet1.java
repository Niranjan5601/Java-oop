package Problems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SHeet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give 2 input :");
        int start= sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            int x = getSum(i);
            int y = reverseDigits(x);
            if (x*y == i){
                System.out.println(i);
            }

        }
    }


    static int getSum(int n)
    {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }


    static int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
}
