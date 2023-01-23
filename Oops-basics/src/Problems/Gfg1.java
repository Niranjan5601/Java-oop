package Problems;

import java.util.ArrayList;

public class Gfg1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int n =5;
        int s = 12;

        System.out.println(subarraySum(arr,5,12));


    }


 public static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList ans = new ArrayList();
        int sum = 0;
        int start = 0;
        int end = 0;
        int count = 0;
        for ( end = 0;end < n; end++) {
            sum +=arr[end];
            count +=1;
           if (sum>s){
               start=end+1;
               end = count;
               count = 0;
               ans.add(start);
               break;
           }

        }
        ans.add(end);

        return ans ;
    }

}
