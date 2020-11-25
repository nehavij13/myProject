package Array;

import java.util.*;

public class ThirdMaximumNumber
{
    public static int thirdMax(int[] nums) {
   /* int n = nums.length;
    Arrays.sort(nums);
    if(n == 1) return nums[n];
    if(n == 2) return nums[n];
    System.out.println(Arrays.toString(nums));
    return nums[n-3];*/
        /*for(int j=0;j<n;j++){
            if(nums[j] > nums[i])
                return nums[i];
            else
                return nums[j];
        }
        if(n==1) return nums[i];
       // if(n==2) return Math.max()max(nums[i],nums[i++]);*/
   // }
//method 1
       /*
        long firstMax = Long.MIN_VALUE,secondMax = Long.MIN_VALUE,thirdMax = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]> firstMax)
            {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            }else if(nums[i]> secondMax && nums[i] < firstMax)
            {
                thirdMax = secondMax;
                secondMax = nums[i];
            }else if( nums[i] > thirdMax && nums[i] < secondMax)
            {
                thirdMax = nums[i];
            }
        }
        return (int)(thirdMax == Long.MIN_VALUE ? firstMax: thirdMax);
    }*/


            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i : nums) {
                if (!pq.contains(i)) {
                    pq.offer(i);
                    if (pq.size() > 3) {
                        pq.poll();
                    }
                }
            }
            if (pq.size() < 3) {
                while (pq.size() > 1) {
                    System.out.println("Initial PriorityQueue: " + pq);
                    pq.poll();
                }
            }
            return pq.peek();
        }

    public static void main(String[] args){
        int[] nums = {5,2};
        System.out.println(thirdMax(nums));

    }
}
