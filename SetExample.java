import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static Set<Character> reorganizeString(String S) {
        Set<Character> hset = new HashSet<Character>();
        for (int i = 0; i < S.length(); i++) {
            hset.add(S.charAt(i));
            //System.out.println(i);

        }
        return hset;
    }
    public static void main(String[] args){
        System.out.println(reorganizeString("abbc"));
    }
}
