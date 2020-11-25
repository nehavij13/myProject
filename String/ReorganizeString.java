package String;

import java.util.HashSet;
import java.util.Set;

public class ReorganizeString {
    public static String reorganizeString(String S) {
      /*  for(char i=0;i<S.length();i++)
            for(char j=1;j<S.length();j++){
                char k = S.charAt(i);
                char m = S.charAt(j);
               // char h = S.charAt(j+1);
                if(k == m)
                {
                    char temp = m;
                    m = h;
                    h = temp;
                    if(S.charAt(j) == S.charAt(j+1))
                        return "";
                }

            }
        return S;*/
        Set<Character> hset = new HashSet<Character>();
        for (int i = 0; i < S.length(); i++) {
            hset.add(S.charAt(i));
            if (hset.size() == S.length()) {
                System.out.println(" nn");
                return "";
            } else {
                //for (char j = 1; j < S.length(); j++)
                   // if (S.charAt(i) == S.charAt( - 1)) {
                        System.out.println(" jnn");
                       // char temp = 0;
                    //}
            }
        }
    return S;
    }
    public static void main(String[] args){
        System.out.println(reorganizeString("abc"));
    }
}
