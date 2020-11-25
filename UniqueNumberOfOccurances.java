import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurances {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();

        int n = arr.length;
        for(int i=0;i<n;i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }
            else
                hmap.put(arr[i],1);
        }
        System.out.println(hmap.keySet());
        System.out.println(hmap.values());
        Set<Integer> hset = new HashSet<Integer>(hmap.values());
        System.out.println(hmap.values());
        for (Integer value : hmap.values()) {
            hset.add(value);
            System.out.println("set val:"+hset);

        }
        System.out.println(hset.size());
        System.out.println(hmap.size());

        if(hset.size() != hmap.size()) return false;
        else return true;
        /*for (Integer value : hmap.values()) {
            if (hset.add(value)) {
                return true;
            }
        }*/

    }

    public static void main(String[] args){
        int[] nums = {5,5,5,4,2,2};
       System.out.println(uniqueOccurrences(nums));
        //uniqueOccurrences(nums);

    }
}
