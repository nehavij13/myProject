package Array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
  /*  int n = nums.length;
    int count = 1;
        HashMap<Integer,Integer> hmap = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
        if(hmap.containsKey(nums[i]))
            hmap.put(nums[i],hmap.get(nums[i])+1);
        else
            hmap.put(nums[i],count);
        }
        System.out.println("hmap is :"+hmap);

       int max = Collections.max(hmap.values());
        int maxkey = 0;
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==max) {
                //System.out.println(entry.getKey());// Print the key with max value
                maxkey = entry.getKey();
            }
        }
        return maxkey;

       // return 0;

    }*/

//

/*
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length;i++){
            int times;
            if(hm.containsKey(nums[i])){
                times = hm.get(nums[i])+1;
            }else{
                times = 1;
            }
            if(times > nums.length/2)
                return nums[i];
            hm.put(nums[i],times);
        }
        return 0;
    }

*/


HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
int result = 0;
for(int num : nums){
hashMap.put(num, hashMap.getOrDefault(num,0)+1);
if(hashMap.get(num) > nums.length/2){
result = num;
break;
}
}
return result;}

/*// Moore voting algorithm
public int majorityElement3(int[] nums) {
    int count=0, ret = 0;
    for (int num: nums) {
        if (count==0)
            ret = num;
        if (num!=ret)
            count--;
        else
            count++;
    }
    return ret;
}*/

    // Arrays.sort(num);
    //
    //    return num[num.length/2];
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2, 1, 1};
        System.out.println(majorityElement(nums));
        //majorityElement(nums);

    }
}

