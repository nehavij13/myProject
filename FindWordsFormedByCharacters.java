import java.util.Arrays;

public class FindWordsFormedByCharacters {
   // public static int countCharacters(String[] words, String chars) {
        //for(String s : words){
        //  System.out.println(s);
        /*int n = s.length();
        System.out.println(n);
        for(int i=0;i<n;i++){
            char val = s.charAt(i);
            System.out.println(val);
        }*/
       /* int count = 0;
        for (String s : words) {
            char[] c = s.toCharArray();
            int n = c.length;
            count = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("for each string:" + c[i]);
               if(chars.indexOf(c[i]) != -1){
                   count++;
                  // System.out.println(c[i]+"is present in"+chars);
                   System.out.println("count is : "+count);
               }

            }
            if(count == s.length()){
               int k = count;
               count++;
            }
        }
        return count;
    }*/
   public static int countCharacters(String[] words, String chars) {
       int good_string = 0;
       int[] a_first = new int[26];
       for(char c : chars.toCharArray()){
           a_first[c - 'a']++;
       }

       for(String word : words){
           int[] b = Arrays.copyOf(a_first,a_first.length);
           int count = 0;
           for(char c : word.toCharArray()){
               if(b[c - 'a'] > 0){
                   count++;
                   b[c - 'a']--;
               }
           }
           if(count == word.length()){
               good_string+= word.length();
           }
       }
       return good_string;
   }
    public static void main(String[] args){
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println(countCharacters(words,chars));
        //countCharacters(words,chars);
    }

}
