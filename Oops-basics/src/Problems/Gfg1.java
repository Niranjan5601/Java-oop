package Problems;

import java.util.ArrayList;
//https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
public class Gfg1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int n = arr.length;
        int s = 12;

        System.out.println(subarraySum(arr,n,s));


    }


 public static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
    int left=0;
    int right =0;
    int sum = arr[right] ;
    ArrayList ans  = new ArrayList();

            while(right < n){


                if (sum == s){
                    ans.add(left+1);
                    ans.add(right+1);
                   return ans;
                }
                if (sum<s){
                    right++;
                    sum+=arr[right];
                    continue;
                }

                if (sum> s){
                    sum -= arr[left];
                    left++;

                }

            }

          ans.add(-1);
            return ans ;
    }

}
