import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RottenOranges {
    public static int orangesRotting(int[][] grid) {
        Integer[] arr = {0,1,2};
        List<Integer> ls = new ArrayList<Integer>(Arrays.asList(arr));

        int count = 0;
       // System.out.println(ls);
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid.length;col++){
                if(grid[row][col] == 2){
                    if(grid[row+1][col] == 1 ){
                    grid[row+1][col] = 2;
                    count++;
                    }}
                    if(grid[row][col] == 2){
                        if(grid[row][col+1] == 1 ){
                            grid[row][col+1] = 2;
                            count++;
                        }}
                //if(grid[row][col] != 2){
                  //  return -1;
                //}
            }

        }
        return count ;


    }
    public static void main (String[] args){
        int[][] gridval = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(orangesRotting(gridval));
    }
}
