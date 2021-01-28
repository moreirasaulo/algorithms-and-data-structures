package adspractice22removeelementfromarray;

import java.util.Arrays;
import java.util.Scanner;

public class ADSPractice22RemoveElementFromArray {
    static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        // Write a Java program to remove a specific element from an array.
        int[] array = {25, 14, 56, 15, 36, 58, 77, 18, 29, 49};
        System.out.println("That's the array: " + Arrays.toString(array));
        System.out.print("Which element you'd like to remove? ");
        int element = input.nextInt();
        int index = 0;
        // Find the index of that element
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if(element == array[i])
            {
                index = i;
            }
        }
        int j = 0;
        // Remove the element in the specified index
        for (j = index; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        
        /* We cannot alter the size of an array , after the removal, the last and second last element in the array 
        will exist twice. It doesn't work for the last element (it removes and replaces itself) */
        System.out.println("After removing the desired element: " + Arrays.toString(array));
    }   
}
