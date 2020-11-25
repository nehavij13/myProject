package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNosDisappearedInArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        System.out.println(n);


    Set<Integer> hset = new HashSet<Integer>();
    for(int i=0;i<n;i++) {
        hset.add(nums[i]);
        //System.out.println(hset);
        }

        List<Integer> ls = new ArrayList<Integer>();
        if(nums.length == 0) return ls;
        for(int i=1;i<=n;i++){
        if(!hset.contains(i)){
            ls.add(i);
        }
        }
        return ls;
    }
/*  public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }
* */

    public static void main(String[] args){
        //int[] arr = {4,3,2,7,8,2,3,1};
        int[] arr = {1,1};
        System.out.println(findDisappearedNumbers(arr));
        //countCharacters(words,chars);
    }
}
