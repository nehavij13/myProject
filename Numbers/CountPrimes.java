package Numbers;

import java.util.Scanner;

public class CountPrimes {
    //private static int primeCount;
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        int count = 1;
        for (int i = 3; i < n; i++) {
            if (isPrime(i) == true) {
                count++;
            }
        }

        return count;

    }


     public static boolean isPrime(int n) {
         if (n % 2 == 0) {
             return false;
         }
         for(int j = 3; j*j <= n; j+=2) {
             if (n%j == 0) {
                 return false;
             }
         }

         return true;
     }

     /*
     for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
      */

     /* class Solution {
    public int countPrimes(int n) {
        // isMultipleOfPrime[i] store whether num i is dividable by a prime num < i
        boolean[] isMultipleOfPrime = new boolean[n];
        // count of prime nums so far
        int count = 0;
        for (int i = 2; i < n; i++) {     // start from 2
            if (!isMultipleOfPrime[i]) {  // if i not dividable by a previous num, it's a prime
                count++;                  // count toward total num of primes seen so far
                for (int j=i; j<n; j=j+i) // mark all multiples of i as non-prime
                    isMultipleOfPrime[j] = true;
            }
        }
        return count;
    }
}
     * */




    public static void main(String[] args){
        int n = 4;
        System.out.println(countPrimes(n));
    }
}
