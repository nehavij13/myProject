package String;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
   /* public static int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
        for(char ci : c){
            if(hmap.containsKey(ci))
                hmap.put(ci,hmap.getOrDefault(ci,0)+1);
            else
                hmap.put(ci,1);
        }
        for(int i=0;i<s.length();i++){
            if(hmap.get(s.charAt(i)) == 1){
                return i;}
        }
        return -1;
    }*/
   public static int firstUniqChar(String s) {
       for (char c : s.toCharArray())
       {
           if(s.indexOf(c) == s.lastIndexOf(c))
               return s.indexOf(c);
       }
       return -1;
   }
    public static void main(String[] args){
        String str = "leetcode";
        System.out.println(firstUniqChar(str));
    }
}
