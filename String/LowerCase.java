package String;

public class LowerCase {
    public String toLowerCase(String str) {
        String result = "";
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                result = result + (char)(c+32);
            }else{
                result = result + c;
            }
        }
        return result;
    }
    public static void main(String[] args){
        String st = "Hello";
        System.out.println(st.toLowerCase());


    }
}
