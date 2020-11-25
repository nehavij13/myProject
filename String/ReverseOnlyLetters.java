package String;

public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String S) {
    char[] c = S.toCharArray();
    int i=0,j=c.length-1;
    while(i<j){
    if(!Character.isLetter(c[i])){
        i++;
    }else if(!Character.isLetter(c[j])){
        j--;}
    else{
        char temp = c[i];
        c[i++] = c[j];
        c[j--] = temp;
    }}
    return new String(c);
    }

    public static void main(String[] args){
        String st = "ab-cd";
        System.out.println(reverseOnlyLetters(st));

    }
}
