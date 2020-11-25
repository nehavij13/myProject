package Array;

import java.util.*;

public class SingleValueArray {

    public static Integer singleNumber(int[] nums) {
  /*      HashMap<Integer,Integer> hmap = new HashMap<>();
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            hmap.put(nums[i],count);
            if(hmap.containsKey(nums[i]) > 1){
            hmap.put(nums[i],count+1);
            System.out.println(hmap);
            }
        }*/

            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0;i<nums.length;i++){
               // System.out.println(nums[i]);
                if (map.containsKey(nums[i])){
                    map.remove(nums[i]);
                }else{
                    map.put(nums[i],1);
                }
            }
            for (Integer i:map.keySet()){
                return i;
            }
            return -1;



           /*     int result = 0;
                for (int n : nums) {
                    result ^= n;
                }
                return result;*/
        /*int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j])count++;
                else
                    System.out.println(nums[i]);}

        }*/

    }

    public static void main(String[] args){
        int[] arr = {2,2,4,4,8};
        System.out.println(singleNumber(arr));
    }
}


    // Using HashMap
  /*  Map<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
        hmap.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
        int complement = target - nums[i];
        if(hmap.containsKey(complement) && hmap.get(complement)!=i)
        return new int[]{i,hmap.get(complement)};
        }
        throw new IllegalArgumentException("no two solutions");
     */
