import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RansomNote {
    public static boolean canConstruct(String a,String b){
        char[] ch = b.toCharArray();
        int count = 0;
        HashMap<Character,Integer> hmap = new HashMap<Character, Integer>();
       for (char c : ch) {
            if (hmap.containsKey(c)) {
                hmap.put(c, hmap.get(c) + 1); }
            else { hmap.put(c, 1);
            }
            System.out.println("Initial Mappings are: " + hmap);

        }

         char[] b1 = a.toCharArray();
         for(char d : b1){
             if(hmap.containsKey(d)){
                 if(hmap.get(d) == 1){
                     hmap.remove(d);
                 }else{
                     hmap.put(d,hmap.get(d)-1);
                 }
             }
             else{
                 return false;
             }
         }
      return true;
    }
    public static void main(String[] args){
        System.out.println(canConstruct("cacaa","aaabc"));
    }
}

//String[] key_array = (String[])hmap.entrySet().toArray();
//System.out.println(key_array);
           /*List<String> targetList = new ArrayList(hmap.values());
           System.out.println(targetList);
           System.out.println(hmap.keySet());*/

 /*   for(int i=0;i<a.length();i++)
        { System.out.println(ch[i]);
        if(hmap.containsKey(a.charAt(i)))
        {
            hmap.put(a.charAt(i),hmap.get(a.charAt(i))+1);
        }
        else {     hmap.put(a.charAt(i), 1); }
            System.out.println("Initial Mappings are: " + hmap); }*/