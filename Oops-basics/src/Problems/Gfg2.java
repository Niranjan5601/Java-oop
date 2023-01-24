package Problems;

//https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category[]=Arrays&sortBy=submissions
public class Gfg2 {

    public static void main(String[] args) {



        int arr[] = {  1,2,3,5};
        System.out.println(MissingNumber(arr,5));




    }

   public static int MissingNumber(int array[], int n) {
        int sum = 0;
        int temp = 0;
       for (int i = 0; i < n-1; i++) {
           sum+= array[i];
       }
       for (int j = 1; j <= n; j++) {
          temp+= j ;
       }
       return temp-sum;
    }
}
