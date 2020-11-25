package Numbers;

public class sqrt {

    /*public static int mySqrt(int x) {
    double y = 1.0d;
    for(;y<=x/2;y += 0.10d){
        if(y*y == x)
            return (int) y;
    }
    return (int) y;
    }*/
    public static int mySqrt(int x) {
        if(x <= 1) return x;
        int left = 1, right = x;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(mid <= x / mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left - 1;
    }
    public static void main(String[] args){
        int num = 8;
        System.out.println(mySqrt(num));
    }
}
