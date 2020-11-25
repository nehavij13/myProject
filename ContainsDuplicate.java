import java.util.HashMap;
import java.util.HashSet;

/*public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            if (hmap.containsKey(nums[i])) {
                hmap.put(count + 1,nums[i]);
                System.out.println("if"+hmap);
               // return true;
            } else {
                hmap.put(count,nums[i]);
                System.out.println("else" + hmap);
                //return false;
            }

            for (int k:hmap.keySet()){
                if(i>1)
                return true ;
            }
            return -1;


        }
        boolean  k = count > 1 ? true : false;
        return k;
    }*/


         /*   for(int k : nums){
                if(count > 0)
                    return true;

            }
            return false;
        }
    public static void main(String[] args){
            int[] arr = {1,2,3,3};
            System.out.println(containsDuplicate(arr));
    }
}*/

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums){

        HashSet<Integer> hset = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            hset.add(nums[i]);
        }
        return hset.size() != nums.length;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,3,4,2};
        System.out.println(containsDuplicate(arr));
    }
}

