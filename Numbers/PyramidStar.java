package Numbers;

public class PyramidStar {
    public static void main(String[] args){
        int numRows = 5;
        //Pattern 1
        /*for(int i=1;i<=numRows;i++){
            for(int j=numRows - i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/
        //Pattern 2
        /*for(int i=1;i<=numRows;i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        //Pattern 3
        /*for(int i=1;i<=numRows;i++) {
            for (int j=numRows-i; j>=1; j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }*/
        //Pattern 4
       int num = 1;
        for(int i=1;i<=numRows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(num);
                    num++;
                }
            System.out.println();
        }
/*
        int val=1;
        for(int i=0;i<numRows;i++){
            for(int j=1;j<i;j++){
                System.out.print(val);
                val++;
            }
            System.out.print("\n");
        }*/

    }

}
