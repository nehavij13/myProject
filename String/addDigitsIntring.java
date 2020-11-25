package String;

public class addDigitsIntring {
    public static int sum(int a) {
        String Row = String.valueOf(a);
        int counter = 0;
        int sum = 0;

        while (counter < Row.length()) {
            //int b = Character.getNumericValue(Row.charAt(counter));
            int b = Row.charAt(counter) - '0';
            System.out.println(b);
            sum = sum + b;
            counter++;
        }
        return sum;
    }
    public static void main(String []args){
        System.out.println("Hello World");
        System.out.println(sum(92));
    }
}
