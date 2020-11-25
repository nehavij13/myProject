package String;

import sun.awt.image.ImageWatched;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class PrintCharacterwithFreqLinkedHashMap {
    public static void printCharWithFreq(String s,int n){
        HashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        for(int i=0;i<n;i++){

         if(map.containsKey(s.charAt(i))){
             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
         }
         else{
             map.put(s.charAt(i),1);
         }

        }
        for(Character c : map.keySet()){
            System.out.println(c+" "+map.get(c));
        }
        //System.out.println(map);
    }

    public static void main(String args[])
    {
        String str = "geeksforgeeks";
        int n = str.length();
        printCharWithFreq(str,n);
    }
}
