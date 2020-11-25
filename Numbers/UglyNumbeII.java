package Numbers;

import java.util.ArrayList;
import java.util.List;

public class UglyNumbeII {

    public static void main(String[] args){
        int number = 15;
        System.out.println(isUgly(number));
    }

    private static int isUgly(int number) {
            int i = 1;
            List<Integer> lt = new ArrayList<Integer>();
            while(lt.size()<number){
           if(checkUgly(i)){
              System.out.println(i);
               i++;
               lt.add(i);
           }
           else
              i++;
            }
           //i++;
           return i-1;


    }

    private static boolean checkUgly(int i) {
        if (i > 0)
            for (int j : new int[] { 2, 3, 5 }) {
                while (i % j == 0) {
                    i /= j;
                }
            }
        return i == 1;
    }
}
