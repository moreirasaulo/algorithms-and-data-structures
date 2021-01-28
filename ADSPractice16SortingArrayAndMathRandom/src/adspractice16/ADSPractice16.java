package adspractice16;

import java.util.Arrays;
import java.util.Scanner;

public class ADSPractice16 {

    static Scanner input = new Scanner(System.in);
    
    static void getRandomNumbersToArray(int[] numArray, int size) {
        // populate the array
        int min = 1;
        int max = 100;
        int range = max - min;
        for (int i = 0; i < size; i++) {
            numArray[i] = (int)(Math.random() * range) + min;
        }        
    }
    
    // Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {
        System.out.print("Enter the size of the integers array: ");
        int size = input.nextInt();
        int[] numArray = new int[size];
        System.out.println();
        
        // Populate the array with random numbers
        getRandomNumbersToArray(numArray, size);
        
        System.out.printf("Array size: %d\n", size);
        System.out.print("Array elements: ");
        String comma = "";
        for (int i = 0; i < size; i++) {
            System.out.print(comma + numArray[i]);
            comma = ", ";
        }
        System.out.println();
        Arrays.sort(numArray); // Also works with String array
        /*
        This can be used if we don't mind the brackets:
        System.out.print("Sorted elements: " + Arrays.toString(numArray));
        */
        comma = "";
        System.out.print("Sorted elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(comma + numArray[i]);
            comma = ", ";
        }        
        System.out.println();
    }    
}
