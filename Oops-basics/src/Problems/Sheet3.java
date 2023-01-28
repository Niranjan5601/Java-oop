package Problems;


import java.util.Arrays;

public class Sheet3 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 8, 9},
                {1, 4, 6},
                {7, 2, 3},

        };

        int[] temp = new int[arr.length * arr[1].length];
    int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                temp[index++] = arr[i][j];
            }
        }
        Arrays.sort(temp);
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            int l = (arr[i].length-1)+k;
            for (int j = 0; j < arr[i].length; j++) {
                if ((i+1)%2 == 0){
                        arr[i][j] = temp[l--];
                        k++;
                }
                else {
                    arr[i][j] = temp[k++];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }



    }
}