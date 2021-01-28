package adspractice26inverseanarray;

import java.util.Arrays;
import java.util.Scanner;

public class ADSPractice26InverseAnArray {
    static Scanner input = new Scanner (System.in);
    
    static int[] buildArray()
    {        
        System.out.print("Set the size of your new array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println();
        int min = 0;
        int max = 100;
        int range = max - min;
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * range) + min;
        }
        System.out.println("This is your newly generated array: " + Arrays.toString(array));
        return array;
    }
    
    static int[] invertArray(int[] array) 
    {
        int[] invertedArray = new int[array.length];
            int i = 0;
            for (int j = array.length - 1; j >= 0; j--) {
                invertedArray[j] = array[i];
                i++;
            }
        return invertedArray;
    }

    public static void main(String[] args) {
        System.out.println("That's the inverted array: " + Arrays.toString(invertArray(buildArray())));
    }  
}
