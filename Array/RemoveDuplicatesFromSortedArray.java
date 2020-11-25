package Array;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicatesFromSortedArray {

  //  public static int removeduplicates(int[] nums){
    /*    HashSet<Integer> hset = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            hset.add(nums[i]);
        }
        //System.out.println(hset);
        Iterator value = hset.iterator();

        // Displaying the values after iterating through the set
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
        return -1;
    }*/
   public static int removeDuplicates(int[] nums) {
       int i=1;
       for(int j=1; j<nums.length; j++){
           if(nums[j]==nums[j-1]) continue;
           nums[i++]=nums[j];
       }
       return i;
   }

    public static void main(String[] args){
        int[] arr = {1,1,2};
      //removeduplicates(arr);
        System.out.println(removeDuplicates(arr));
    }
}
