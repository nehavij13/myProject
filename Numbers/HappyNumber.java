package Numbers;

import java.util.HashSet;
import java.util.Set;
/*
public class HappyNumber {
    public static boolean isHappy(int n){
        Set<Integer> hset = new HashSet<Integer>();
        while(!hset.contains(n)){
            hset.add(n);
            n = cal(n);
            if(n==1)
                return true;
        }
        return false;
    }
    public static int cal(int n) {
    String s = String.valueOf(n);
    int sqr = 0;
    //int sum,temp;

    for(int i=0;i<s.length();i++) {
        int val = s.charAt(i) - '0';
        sqr += val * val;

    }
   return sqr;
    }
    public static void main(String[] args){
        int num = 19;
        System.out.println(isHappy(num));
        //isHappy(num);
    }
}*/
public class HappyNumber {

    public static boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<Integer>();
        if (n == 1){
            return true;
        }
        else {
            int sum = 0;
            while (n > 0){
                int x = n % 10;
                sum += x * x;
                n /= 10;
            }
            if (!hs.contains(sum)){
                hs.add (sum);
                return isHappy (sum);
            }
            else {
                return false;
            }
        }
    }
    public static void main(String[] args){
        int num = 91;
        System.out.println(isHappy(num));
        //isHappy(num);
    }
}
