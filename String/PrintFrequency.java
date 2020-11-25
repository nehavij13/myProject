package String;

import java.util.Scanner;

public class PrintFrequency {
    public static void main(String []args){
        System.out.println("Hello World");
        int[] a = new int[26];
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) >='a' && str.charAt(i) <='z')
            {
                a[str.charAt(i) - 'a']++;
            }
        }
        for(int i=0;i<=26;i++){
            if(a[i]>0){
                System.out.println((char)(i+65)+""+a[i]);
                //System.out.print(str.charAt(i));
                //System.out.print(a[i] + " ");
            }
        }
    }
}
