package Numbers;

import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
    if(nums.length==0 && nums[0]==0) return 1;
    int n = nums.length - 1;
    Arrays.sort(nums);
    int k = nums[n];
    for(int i=0;i<nums.length;i++){
        System.out.println(i + "->" + nums[i]);
        if(i != nums[i]) return i;}
    return nums.length;
    }
    public static void main(String[] args){
        //int numarr[] = {9,6,4,2,3,5,7,0,1};
        int numarr[] = {0,1};
        System.out.println(missingNumber(numarr));
    }
}
/*method 2
 public static int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return total - sum;
    }

 */
