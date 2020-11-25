package Array;

import java.util.Arrays;

public class MergeTwoArrays {
   /* public static void merge(int[] A, int m, int[] B, int n)
    {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0)
        {
            if(A[i] > B[j])
                A[k--] = A[i--];
                //System.out.println(A[k]);
                //System.out.println(A[i]);

            else
                A[k--] = B[j--];
        }

        while(j >= 0)
            A[k--] = B[j--];
    }*/


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if (nums1 != null && nums1.length != 0 && nums2 != null && nums2.length != 0) {

            while (m >=1 && n >= 1) {
                if (nums1[m-1] >= nums2[n-1]) {
                    nums1[m+n-1] = nums1[m-1];
                    m--;
                } else {
                    nums1[m+n-1] = nums2[n-1];
                    n--;
                }
            }

            if (m == 0) {
                for (int i = 0; i < n; i++) {
                    nums1[i] = nums2[i];
                }
            }

            System.out.println("Merged Sorted Array" + Arrays.toString(nums1));
        }
    }
    public static void main(String[] args){
        int[] nums1 = {1,3,4,9,0,0,0};
        //nums1 = {1,3,4,0,0,0};
        int[] nums2 = {1,5,6};
        int m = 4;
        int n = 3;
        merge(nums1,m,nums2,n);
    }
}
