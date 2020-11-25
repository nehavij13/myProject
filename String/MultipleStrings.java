package String;

//wrong
public class MultipleStrings {
    public String multiply(String num1, String num2) {
    int i1 = Integer.valueOf(num1);
    int i2 = Integer.valueOf(num2);
    System.out.println(i1+","+i2);
    int i3 = i1*i2;
    System.out.println(i3);
    String num3 = String.valueOf(i3);
    System.out.println(num3);
    return num3;
    }
    public static void main(String[] args){
    String str1 = "6913259244";
    String str2 = "71103343";
    new MultipleStrings().multiply(str1,str2);

    }
}
