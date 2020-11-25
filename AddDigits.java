public class AddDigits {
    /*public static int addDigits(int num){
        num = cal(num);
        if()
    }*/
    /*method 1*/
  public static int addDigits(int num) {
        String str = String.valueOf(num);

        while(str.length() > 1){ int sum = 0;
        for(int i=0;i<str.length();i++){
            int val = str.charAt(i) - '0';
            sum += val;
            System.out.println(sum);
        }
           // sum = addDigits(sum);
            str = String.valueOf(sum);
        }
            //if(str.length() == 1) return sum;

        return Integer.parseInt(str);
    }
  //method 2
   /*
    public static int addDigits(int num) {
        if (num == 0) return num;
        if (num > 0 && num <= 9) return num;
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        //sum = sum + num % 10;
        return addDigits(sum);
    }*/
   /*Method 3*/
    /*public static int addDigits(int num) {
        while (num > 9) {
            int curRes = 0;
            int cur = num;
            while (cur > 0) {
                curRes += cur % 10;
                cur /= 10;
            }
            num = curRes;
        }
        return num;
    }*/

   /* public static int addDigits(int num){
        if(num<10) {return num;}
        else{
        int val = 0;
        //while(num > 0){
            //int n = num%10;
            val += num%10;
            num = num/10;
            val += num;
            return addDigits(val);
        }
        //int k =addDigits(val);

    }*/

    public static void main(String[] args){
        int num = 38;
        System.out.println(addDigits(num));
    }
}
