import java.util.*;

public class WordPattern {
    /*public static void wordPattern(String pattern, String str) {
        String[] st = str.split(" ");
       // String newstr = Arrays.toString(st);
        for(int i=0;i<st.length;i++)
            System.out.println(st[i]);

         char[] ch = pattern.toCharArray();
         for(int j=0;j<ch.length;j++)
             System.out.println(ch[j]);

        int count = 1;
        HashMap<Character, Integer> hs = new LinkedHashMap<Character,Integer>();
        for(char c : ch){
            if(hs.containsKey(c)){
                hs.put(c,hs.get(c));
            }
            else{
                hs.put(c,count);
                count++;
            }
        }
        System.out.println(hs.entrySet());
        int count_s = 1;
        HashMap<String, Integer> hmap = new LinkedHashMap<String,Integer>();
        for(String stt : st){
            //for(int i=0;i<st.length;i++){
            if(hmap.containsKey(stt)){
                hmap.put(stt,hmap.get(stt));
            }
            else{
                hmap.put(stt,count_s);
                count_s++;
            }
        }

        System.out.println(hmap.entrySet());

        //if(hs.size()== hmap.size() && hs.containsValue())
        System.out.println( new ArrayList<>( hs.values() ).equals(new ArrayList<>( hmap.values() )) );
            //return true;
        //else return false;


    }*/
    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        System.out.println(words);
        if (words.length != pattern.length()) return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            System.out.println(key);
            String word = words[i];
            System.out.println(word);
            if (map.containsKey(key) && !map.get(key).equals(word)) return false;
            if (!map.containsKey(key) && map.containsValue(word)) return false;
            map.put(key, word);
        }
        return true;
    }
    public static void main(String[] args){
        String str = "dog cat dog";
        String pat = "abc";
        System.out.println(wordPattern(pat, str));
        //wordPattern(pat, str);
    }
}
