package Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //if number of rows is 0
        if(numRows == 0) return res;

        //for only 1st list which contains 1 element that is 1
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);

        //after the 1st row
        for (int i = 1; i < numRows; i++) {
            List<Integer> preRows = res.get(i-1); // its going to be 1 ,the previous row since we have to get data from previous row
            List<Integer> curRows = new ArrayList<Integer>();
            curRows.add(1);
            for (int j = 1; j < i; j++){
                curRows.add(preRows.get(j-1) + preRows.get(j));
            }

           curRows.add(1);
            res.add(curRows);
        }
        return res;
    }

    public static void main(String[] args){
        int num = 5;
        System.out.println(generate(num));
    }
}
