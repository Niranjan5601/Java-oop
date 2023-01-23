package Loops;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.*;

public class For_loops {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i :arr){
            System.out.println(i);
        }
    }
}
