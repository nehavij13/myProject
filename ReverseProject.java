public class ReverseProject {
    public static String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        // split to words by space
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; --i) {
            System.out.println(arr[i]);
            if (!arr[i].equals("")) {
                System.out.println(sb.append(arr[i]).append(" "));
            }
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
        //return sb.substring(0);
    }

    public static void main(String[] args){
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
