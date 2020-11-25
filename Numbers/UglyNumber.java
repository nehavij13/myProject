package Numbers;

public class UglyNumber {
    public static boolean isUgly(int num) {
   // if(!(num%2 == 0 )|| !(num%3==0) ||!(num%5==0)) return false;
    //return true;
   /* for(int i=2;i<=9;i++)
        if(num%i==0 && (i!=2 || i!=3 || i!=5)) return false;
        return true;*/
            if (num > 0)
                for (int i : new int[] { 2, 3, 5 }) {
                    while (num % i == 0) {
                        num /= i;
                    }
                }
            return num == 1;

    }
    public static void main(String[] args){
        int number = 16;
        System.out.println(isUgly(number));
    }
}

