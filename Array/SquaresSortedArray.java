package Array;

import java.util.Arrays;

public class SquaresSortedArray {
    public static int[] sortedSquares(int[] A) {
        int n = A.length;
        for(int i=0;i<n;i++)
                A[i] = A[i] * A[i];
       Arrays.sort(A);
       // for (int number : A)
         //  System.out.println("Number = " + number);

        return A;
    }
    public static void main(String[] args){
        int[] A = {-4,-1,0,3,10};
       System.out.println(sortedSquares(A));

    }
}
