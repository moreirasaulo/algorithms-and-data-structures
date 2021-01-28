package adsday01universalarrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ADSDay01UniversalArrays {

    static Scanner input = new Scanner(System.in);

    static int getInt() {
        int value = -1;
        while (true) {
            try {
                value = input.nextInt();
                return value;
            } // end try
            catch (InputMismatchException ex) {
                input.next(); // consume the wrong value
                System.out.println(ex.getMessage());
                System.out.println("Enter an integer: ");
            } // end catch            
        } // end while
    } // end method getInt

    static void inputArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.printf("Enter value: %d: ", i + 1);
            data[i] = getInt();
        }
    }

    static void inputArray(int[][] data2d) {
        for (int row = 0; row < data2d.length; row++) {
            for (int col = 0; col < data2d[row].length; col++) {
                System.out.printf("Enter value row %d column %d: ", row + 1, col + 1);
                data2d[row][col] = getInt();
            }
        }
    }
    
    static void printArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%s%d", i == 0 ? "" : ", ", data[i]);
        }
    }
    
    static void printArray(int[][] data2d) {
        for (int row = 0; row < data2d.length; row++) {
            for (int col = 0; col < data2d[row].length; col++) {
                System.out.printf("%s%d", col == 0 ? "" : ", ", data2d[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayAdv(int[][] data2d) {
        // find the maximum row length
        int maxRowLength = data2d[0].length;
        for (int row = 0; row < data2d.length; row++) {
            if (data2d[row].length > maxRowLength) {
                maxRowLength = data2d[row].length;
            }
        }
        // get columns width
        int[] columnsWidth = new int[maxRowLength];
        for (int col = 0; col < maxRowLength; col++) {
            columnsWidth[col] = 0;
            for (int row = 0; row < data2d.length; row++) {
                if (col >= data2d[row].length) {
                    continue;
                }
                int length = String.valueOf(data2d[row][col]).length();
                if(columnsWidth[col] < length) {
                    columnsWidth[col] = String.valueOf(data2d[row][col]).length();
                }
            }            
        }
        // printArray(columnsWidth);
        // Print Array
        System.out.println("");
        for (int row = 0; row < data2d.length; row++) {
            for (int col = 0; col < data2d[row].length; col++) {
                System.out.printf("%s" + columnsWidth[col] + "d", col == 0 ? "" : ", ", data2d[row][col]);
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        // Unfinished
    }

}
