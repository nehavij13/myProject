package Array;

import java.util.Arrays;

public class PlusOne {
   /* public static int[] plusOne(int[] digits) {

        int num = 0;
        for (int a : digits) {
            num = 10*num + a;
            System.out.println(num);
        }
        num = num +1;
        System.out.println(num);

        String str = Integer.toString(num);
        System.out.println(str);
        int[] digitsNew = new int[str.length()];
        for(int j=0;j<digitsNew.length;j++)
        {

            digitsNew[j] = Character.getNumericValue(str.charAt(j));
            System.out.println(digitsNew[j]);
        }

    return digitsNew;
    }*/
   public static int[] plusOne(int[] digits) {
       System.out.println(digits.length);
       for (int i = digits.length - 1; i >=0; i--) {
           if (digits[i] != 9) {
               digits[i]++;
               break;
           } else {
               digits[i] = 0;
           }
           System.out.print(digits[i]);
       }
       if (digits[0] == 0) {
           int[] res = new int[digits.length+1];
           res[0] = 1;
           return res;
       }

       return digits;
   }

    public static void main(String[] args) {
        int[] digits = {6,9,9};
       plusOne(digits);
        for (int i=0;i<digits.length;i++)
            System.out.print(digits[i]);
        //plusOne(digits);

    }
}
