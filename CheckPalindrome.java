public class CheckPalindrome {
    public static boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        System.out.println(n);
        for(int i=0;i<n;i++) {
            if (c[i] != c[n - i - 1])
                return false;
        }

            return true;


    }

    public static void main(String []args){
        System.out.println("Hello World");
        System.out.println(isPalindrome("nehaaaa"));
    }
}
