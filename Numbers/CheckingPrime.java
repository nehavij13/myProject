package Numbers;

import java.util.Scanner;

class CheckingPrime {
    public static int countPrimes(int n) {
        int count = 0;
        int times = 0;
        for (int i = 1; i <= n; i++) {
                if (n%i == 0){
                    count++;
                    System.out.println("count is "+ i);
             }
        }
        if(count == 2) {
            System.out.println("value "+ n +" has 2 factors");
            System.out.println("prime number");
        }
  return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countPrimes(n));
    }
}
