package day01twodimarrays;

public class Day01TwoDimArrays 
{
    static int[][] data = 
    {
        {-99, 2, 22},
        {15, -71, 5}
    };
    
    static void sumOfAll()
    {
        int sum = 0;
        for (int row = 0; row < data.length; row++) 
        {
            for (int col = 0; col < data[row].length; col++) 
            {
                sum += data[row][col];
            }
        }
        System.out.println("Sum of all equals: " + sum);
    }
    
    static void sumOfRows() {        
        for (int row = 0; row < data.length; row++) {
            int sum = 0;
            for (int col = 0; col < data[row].length; col++) {
                sum += data[row][col];
            }
            System.out.printf("Sum of row %d equals: %d\n", row, sum);
        }        
    }
    
    static void sumOfCols() {
        // this only works for rectangular arrays
        // N.B. It would make an interesting question to re-write this to work on non-rectangular (jagged) arrays
        for (int col = 0; col < data[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < data.length; row++) {
                sum += data[row][col];    
            }  
            System.out.printf("Sum of col %d equals: %d\n", col, sum);
        }
    }

    static void stdDev() {
        int sum = 0;
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                sum += data[row][col];
            }
        }
        // this is valid for rectangular array only
        double avg = (double) sum / (data.length * data[0].length);
        //
        double sumOfSquares = 0;
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                int val = data[row][col];
                sumOfSquares += (val - avg) * (val - avg);
            }
        }
        double variance = sumOfSquares / (data.length * data[0].length);
        double stdDev = Math.sqrt(variance);
        System.out.printf("Standard deviation is: %.3f\n", stdDev);
    }
    
    public static void main(String[] args) 
    {
        sumOfAll();
        sumOfRows();
        sumOfCols();
        stdDev();
    }    
}