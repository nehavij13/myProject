package String;

public class atoi {
    public static int myAtoi(String str) {
       /* str = str.trim();
        //if(str.contains("[a-z]"))
        //str = str.split(' ');
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
            //if(Character.isLetter(ch[i])){
              //  System.out.println("is a letter");
            //}
            if(!Character.isDigit(ch[i])){
                System.out.println("is a digit");
            }

        }



      /*  for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
            int s = 0;
            return s;
            }
        }
        int st = Integer.valueOf(str);
        return st;*/
      //return ch;*/


            if (str == null || str.length() == 0)
                return 0;//
            str = str.trim();
            char firstChar = str.charAt(0);
            int sign = 1, start = 0, len = str.length();
            long sum = 0;
            if (firstChar == '+') {
                sign = 1;
                start++;
            } else if (firstChar == '-') {
                sign = -1;
                start++;
            }
            for (int i = start; i < len; i++) {
                if (!Character.isDigit(str.charAt(i)))
                    return (int) sum * sign;
                sum = sum * 10 + str.charAt(i) - '0';
                if (sign == 1 && sum > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            }

            return (int) sum * sign;


    }
    public static void main(String[] args){
        String str = " 66774";
       System.out.println(myAtoi(str));
       // myAtoi(str);
    }
}
