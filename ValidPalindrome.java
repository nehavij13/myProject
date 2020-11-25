public class ValidPalindrome {
    /*method1
    public static boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1 || s.matches("[^a-zA-Z0-9]*") ) return true;
        s = s.toLowerCase();
        s = s.replaceAll("\\s","");
        s = s.replaceAll("[^a-zA-Z0-9]","");
        String str = "";
        for(int j=s.length()-1;j>=0;j--){
            str = str + s.charAt(j);
            if(str.equals(s))
                return true;
        }
        return false;

    }*/

    //method 2
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String []args){
        System.out.println("Hello World");
        System.out.println(isPalindrome("a man nama"));
    }
}
