public class SearchInsertPosition {
    /*public static int searchInsert(int[] nums, int target) {
        int start = 0;//0
        int end = nums.length-1;//7
        //System.out.println(start);
       // System.out.println(end);

       while(start<=end){
           int mid = start + (end-start)/2;
           //System.out.println(mid);//3
           if(target == nums[mid]) return mid;
           if(target < nums[mid])
           {end = mid-1;
           if(target == end)
               return end;
           else if (target < nums[mid] && target < end ) return end+1;
                }
           if(target > nums[mid])
           {start = mid+1;
           if(target == start)
               return start;
           else if (target > nums[mid] && target < end ) return end;}

       }


        return 0;
    }*/
    public static int searchInsert(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    public static void main(String[] args){
        int[] nums = {1,3,5,7};
        int target = 8;
        System.out.println(searchInsert(nums,target));
    }
}
