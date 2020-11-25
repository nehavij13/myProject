package Array;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        hmap.put(0,1);
        int sum = 0;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            if(hmap.containsKey(sum - k)){
                result += hmap.get(sum - k);
            }
            hmap.put(sum,hmap.getOrDefault(sum,0)+1);
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,1};
        System.out.println(subarraySum(arr,2));
    }
}
