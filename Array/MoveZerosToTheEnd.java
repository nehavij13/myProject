package Array;

public class MoveZerosToTheEnd {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                nums[k++] = nums[i];
            }}
           // else
             //  continue;}
            //for (int j = k; j <nums.length; j++) {
                //nums[j] = 0;
            //}
            while(k<n)
               nums[k++] = 0;

    }
    public static void main(String[] args){
        int[] nums = {0,2,0,7,0,3};
        moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
