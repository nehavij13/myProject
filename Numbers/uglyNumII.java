package Numbers;

import java.util.ArrayList;
import java.util.List;

public class uglyNumII {
        public static int nthUglyNumber(int n) {
            if (n <= 0) { return 0; }
            List<Integer> seq = new ArrayList<>();
            seq.add(1);
            int head2 = 2, head3 = 3, head5 = 5;
            int ptrGen2 = 1, ptrGen3 = 1, ptrGen5 = 1;
            while (seq.size() < n) {
                int min = Math.min(head2, Math.min(head3, head5));
                seq.add(min);
                if (min == head2) { head2 = seq.get(ptrGen2++) * 2; }
                if (min == head3) { head3 = seq.get(ptrGen3++) * 3; }
                if (min == head5) { head5 = seq.get(ptrGen5++) * 5; }
            }
            return seq.get(seq.size()-1);
        }
    public static void main(String[] args){
        int number = 15;
        System.out.println(nthUglyNumber(number));

    }

}
