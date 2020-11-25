import java.util.HashMap;

public class RemoveElement {
    /*public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int j = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == val)
                j++;
        }
        return n-j;
    }*/
   /* public static int removeElement(int[] nums, int val) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++) {
            hmap.put(i, nums[i]);
            if(hmap.containsValue(val)) {
                hmap.remove(i, nums[i]);
            }
            else{
                hmap.put(i, hmap.get(i));
            }
            System.out.println(hmap);
            for(int k : hmap.values()){
                return k;
            }
            //System.out.println(nums[i]);
        }

        return hmap.size();
    }*/
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int n : nums){
            if (n != val){
                nums[i++] = n;
                System.out.println("elements are :"+nums[i]);}}
        return i;
    }
    public static void main(String[] args){
    int[] nums = {3,2,7,8,3};
    int val = 3;
    System.out.println(removeElement(nums,val));
    }
}
