import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class uncommonWords {
    public static String[] uncommonFromSentences(String A, String B) {
    String[] arr1 = A.split(" ");
    String[] arr2 = B.split(" ");
    HashMap<String,Integer> hmap = new HashMap<String,Integer>();
    for(String s : arr1)
        hmap.put(s,hmap.getOrDefault(s,0)+1);

    for(String s : arr2)
        hmap.put(s,hmap.getOrDefault(s,0)+1);
    List<String> ls = new ArrayList<String>();
    for(String s : hmap.keySet())
        if(hmap.get(s)==1)
            ls.add(s);
           // System.out.println(ls);
    return ls.toArray(new String[0]);

    }

    public static void main(String[] args){
        String A = "this is a toy";
        String B = "this is a";
        System.out.println(uncommonFromSentences(A,B));
        //uncommonFromSentences(A,B);
        //countCharacters(words,chars);
    }
}
