package Array;

import java.util.Arrays;

public class UnsortedSubarray {
   /* public static int findUnsortedSubarray(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int i = 0;
        while (i < nums.length && nums[i] == sorted[i]) i++;
        int j = nums.length - 1;
        while (j > i && nums[j] == sorted[j]) j--;
        return j - i + 1;
    }*/
   /* public static int findUnsortedSubarray(int[] nums) {
        int[] sortedArr = nums.clone();
        Arrays.sort(sortedArr);
        int i=0,n=nums.length,j=nums.length-1;
        while(i<n && nums[i] == sortedArr[i]) i++;
        while(i<j && nums[j] == sortedArr[j]) j--;

        return j-i+1;
    }*/
    public static int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int i=0;int j=n-1;
        for (i=0;i<nums.length;i++){
            for (j=nums.length-1;j>=0;j--){
                if(nums[i] <= nums[i+1]) i++;
                else if(nums[j] >= nums[j-1]) j--;
            }

        }
        return n-i+j;
    }

    /*
    public int findUnsortedSubarray(int[] nums) {
       int[] temp = new int[nums.length];
        for (int i=0;i<nums.length;i++)
            temp[i]= nums[i];
        Arrays.sort(temp);
        int count =0;
        for (int i=0;i<nums.length;i++){
            if (temp[i]==nums[i])
                count++;
            else break;}
        for (int i=nums.length-1;i>=0;i--){
            if (temp[i]==nums[i])
                count++;
            else break;}

        return Math.max(nums.length-count,0);
    }
     */
   /* public int findUnsortedSubarray(int[] nums) {
        if(nums==null||nums.length<=1) return 0;
        int[] copynums=nums.clone();
        Arrays.sort(copynums);
        int start=0;
        while(start<nums.length&&copynums[start]==nums[start]){
            start++;
        }

        int end=nums.length-1;
        while(end>=start&&copynums[end]==nums[end]){
            end--;
        }

        return end>start?end-start+1:0;
    }*/
    public static void main(String[] args){
        int[] nums = {1,5,4,7,0,9};
        System.out.println(findUnsortedSubarray(nums));
    }
}
