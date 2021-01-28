package adspractice14day01twodimarrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ADSPractice14Day01TwoDimArrays {
    static Scanner input = new Scanner(System.in);
   
    static int sumNumbersOfArray(int[][] array2d)
    {
        int sum = 0;
        for (int row = 0; row < array2d.length; row++)
        {
            for (int col = 0; col < array2d[row].length; col++)
            {
                sum = sum + array2d [row][col];
            }
        }
        return sum;
    }
    
    static int[] sumOfEachRow(int[][] array2d)
    {
        int[] sumOfRow = new int[array2d.length];        
        
        for (int row = 0; row < array2d.length; row++) { // length finds the number of rows...
            int sum = 0;
            // System.out.println("I entered " + row + " row");
            for (int col = 0; col < array2d[row].length; col++) { // ...and this one will find the columns
                // System.out.println("I entered " + row + " row" + " and " + col + " column");
                sum = sum + array2d[row][col];
            }
            sumOfRow[row] = sum;
            System.out.println("The sum of row " + row + " is " + sum);            
        }
        return sumOfRow;
    }    
    
    static double stdDev(int[][] array2d) {
        int sum = 0;
        for (int row = 0; row < array2d.length; row++) {
            for (int col = 0; col < array2d[row].length; col++) {
                sum += array2d[row][col];
            }
        }
        // this is valid for rectangular array only
        double avg = (double) sum / (array2d.length * array2d[0].length);
        double sumOfSquares = 0;
        for (int row = 0; row < array2d.length; row++) {
            for (int col = 0; col < array2d[row].length; col++) {
                int val = array2d[row][col];
                sumOfSquares += (val - avg) * (val - avg);
            }
        }
        double variance = sumOfSquares / (array2d.length * array2d[0].length);
        double stdDev = Math.sqrt(variance);
        return stdDev;
    }
    
    // Function to know if a given number is prime
    public static boolean isPrime(int num)
    {
        if (num < 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void sumOfTwoNumbersOfArrayIsPrime(int[][] array2d)
    {
        for (int row = 0; row < array2d.length; row++) {
            for (int col = 0; col < array2d[row].length; col++) { // gets the each number here
                for (int i = 0; i < array2d.length; i++) { // and, for each #, it goes for the rest
                    for (int j = 0; j < array2d[row].length; j++) {
                        int sum = array2d[row][col] + array2d[i][j]; // the first number that was caught will 
                        if (isPrime(sum) && row < i && col < j)            // loop on the others
                        {                               
                            System.out.printf("The sum of elements %d and %d equals %d, which is a prime number.\n", 
                                array2d[row][col],  array2d[i][j], sum);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {        
        try
        {
            System.out.print("Set the number of rows: ");
            int rows = input.nextInt();
            if(rows < 1)
            {
                System.out.println();
                System.out.print("Invalid input. The integer should be 1 or greater");
            }
            
            System.out.print("Set the number of columns: ");
            int columns = input.nextInt();
            if(columns < 1)
            {
                System.out.println();
                System.out.print("Invalid input. The integer should be 1 or greater");
            }
            System.out.println();
                      
            int[][] multiArray = new int[rows][columns];
            int[] sumOfCols = new int[multiArray[0].length]; // This array will store the sum of each column
            
            int max = 99;
            int min = -99;
            int range = max - min + 1;
            
            // Create the numbers and display the multidimensional array
            System.out.println("That's the newly created multidimensional array:");
            String comma = "";
            for (int row = 0; row < multiArray.length; row++) {
                for (int col = 0; col < multiArray[row].length; col++) {
                    multiArray[row][col] = (int)(Math.random() * range) + min;
                    System.out.print(comma + multiArray[row][col]);
                    comma = ", ";
                    sumOfCols[col] = sumOfCols[col] + multiArray[row][col]; // to sum each column and store in the sumOfCols array
                }
                System.out.println();
                comma = "";
            }        
            System.out.println();
            
            // Sum of all numbers
            System.out.print("That's the sum of all numbers in the array: " + sumNumbersOfArray(multiArray) + "\n");
            System.out.println();
            
            // Sum of each row
            System.out.print("That's the sum of each row of the array: \n");
            sumOfEachRow(multiArray);
            System.out.println();
            
            // Sum of each column
            System.out.print("That's the sum of each column of the array: \n");
            for (int c = 0; c < sumOfCols.length; c++) {
                System.out.print("The sum of column " + c + " is: " + sumOfCols[c] + "\n");
            }                        
            System.out.println();
            
            // Standard deviation
            System.out.printf("The standard deviation is %.3f\n", stdDev(multiArray));
            System.out.println();
            
            // Pairs of numbers whose sum is a prime number
            sumOfTwoNumbersOfArrayIsPrime(multiArray);
        }
        catch(InputMismatchException ex) // Exception for when it should be integer and it's not
        {
            System.out.println("Error: The value should be an integer."); 
        }
    }    
}
