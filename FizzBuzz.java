import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
    List<String> ls = new ArrayList<String>();
    for(int i=1;i<=n;i++){
        if (i%3 == 0 && i%5 ==0) ls.add("FizzBuzz");
        //System.out.println("FizzBuzz");
        else if(i==5 || i%5 == 0) ls.add("Buzz");
            //System.out.println("Buzz");
        else if(i==3 || i%3 == 0) ls.add("Fizz");
            //System.out.println("Fizz");
        else
            ls.add(Integer.toString(i));
            //System.out.println(String.valueOf(i));
    }
    return ls;
    }
    public static void main(String[] args){
    System.out.println(fizzBuzz(15));
    }
}
