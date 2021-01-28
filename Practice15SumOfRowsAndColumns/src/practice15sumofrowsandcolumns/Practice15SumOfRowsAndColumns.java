package practice15sumofrowsandcolumns;

public class Practice15SumOfRowsAndColumns {
    static int[][] array = {{1,2,3},{3,4,5},{7,8,9}};
    static String comma = "";
    public static void main(String[] args) {  
        int sumOfRow = 0;
        int sumOfAll = 0;
        int col = 0;
        int[] sumOfCols = new int[array[0].length];

        for (int row = 0; row < array.length; row++) { // length accesses the size of rows
            for (col = 0; col < array[row].length; col++) { // and here we go for each column of each row
                System.out.print(comma + array[row][col]); // will go to each one of them and print
                comma = ", ";
                sumOfRow = sumOfRow + array[row][col];
                sumOfAll = sumOfAll + array[row][col];
                sumOfCols[col] = sumOfCols[col] + array[row][col];
            }
            System.out.println();
 
            comma = "";
            
            System.out.println("Sum of " + row + " row: " + sumOfRow);
            System.out.println();
            sumOfRow = 0;
            //break; // prints just first row
        }
        
        for (int c = 0; c < sumOfCols.length; c++) {
            System.out.print("The sum of column " + c + " is: " + sumOfCols[c] + "\n");
        }
        
        System.out.println();
        System.out.println("Sum of all numbers: " + sumOfAll);
    } 
}
