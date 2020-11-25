package String;

public class ReverseString {
   public static void main(String[] args)
        {
           /* Method 1
            String input = "Geeks for Geeks";

            StringBuilder input1 = new StringBuilder();

            // append a string into StringBuilder input1
            input1.append(input);

            // reverse StringBuilder input1
            input1 = input1.reverse();

            // print reversed String
            System.out.println(input1);*/


            /*Method 2
            String input = "Geeks for Geeks";
            char[] ch = input.toCharArray();
            for(int i=ch.length-1;i>=0;i--)
                System.out.println(ch[i]);*/
            //Method 3
            String input = "the sky is blue";
            char[] ch = input.toCharArray();
            int start = 0;
            int end = ch.length-1;
            for(start=0;start<end;start++,end--){
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
            }
            for(char c:ch)
                System.out.println(c);

        }
}


