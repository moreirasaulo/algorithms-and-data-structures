package adspractice21findindex;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ADSPractice21FindIndex {

    // Write a Java program to find the index of an array element.
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36};
        System.out.print("That's the array: ");
        System.out.print(Arrays.toString(array) + "\n");
        System.out.println();
        try {
            System.out.print("Now please indicate which element you would like to verify the index: ");
            int element = input.nextInt();
            boolean isFound = false;
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                if (element == array[i]) {
                    System.out.println("The index of that element is " + i);
                    isFound = true;
                    break;
                }                  
            }
            if (isFound == false) {
                System.out.println("This element does not exist in the array, try again.");
            }            
        } catch (InputMismatchException ex) {
            System.out.println("Error: the input returns " + ex.getMessage() + " value.");
        }
    }
}
