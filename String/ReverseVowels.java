package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public static String reverseVowels(String s) {
    /*char[] vow = {'a','e','i','o','u'};
    char[] c =  s.toCharArray();
    int i=0;int j=c.length -1;
    while(i<j){
        int k = 0;
        int temp = c[i];
    }*/
    Set<Character> hset = new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
    char[] c = s.toCharArray();
    int i=0,j=c.length-1;
    while(i<j){
        if(!hset.contains(c[i])){
            i++;
        }
        else if(!hset.contains(c[j])){
            j--;
        }
        else{
            char temp = c[i];
            c[i++] = c[j];
            c[j--] = temp;

        }
    }
    return new String(c);

    }
/*
class Solution {
    public String reverseVowels(String s) {

        char[] c = s.toCharArray();
        int start = 0;
        int end = c.length - 1;

        while(start < end) {
            if (!IsVowel(c[start])) start++;
            else if (!IsVowel(c[end])) end--;
            else {
                char temp = c[start];
                c[start++] = c[end];
                c[end--] = temp;
            }
        }

        return new String(c);
    }

    public boolean IsVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

}
* */
    public static void main(String[] args){
        String st = "leetcode";
        System.out.println(reverseVowels(st));


    }
}
