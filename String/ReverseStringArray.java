package String;

public class ReverseStringArray {
    public static String reverseStringArray(char[] s) {
    //for(int i=0;i<s.length;i++){
        for (int i=0,j=s.length-1;i<j;i++,j--){
       //for (int j = s.length-1 ; j >= 0; j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;


    }
        return new String(s);
        /*int l = 0, h = s.length - 1;
        while(l < h) {
            char t = s[l];
            s[l++] = s[h];
            s[h--] = t;
    }*/

    }

    public static void main(String[] args){
        char[] ch = {'h','e','l','l','o'};
        System.out.println(reverseStringArray(ch));


    }
}
