package adspractice19arrayaveragevalueofelements;

import java.util.Arrays;
import java.util.Scanner;

public class ADSPractice19ArrayAverageValueOfElements {
    
    static Scanner input = new Scanner(System.in);
    static int[] array;
    
    static void generateNumbersForArray(int[] array)
    {
        // insert some numbers in the array
        int min = 1;
        int max = 100;
        int range = max - min;
        for (int col = 0; col < array.length; col++) {
            array[col] = (int)(Math.random() * range) + min;
        }
        System.out.println("These are the generated numbers for the array: " + Arrays.toString(array));
    }
    
    static void averageValueOfAnArray(int[] array)
    {
        // sum
        double sum = 0;
        for (int col = 0; col < array.length; col++) {
            sum = sum + array[col];
        }     
        // create variable to store the avg and return result
        double average = sum / array.length;
        System.out.printf("That's the average value of the above elements: %.2f", average);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("How many elements will have this array? ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println();
        generateNumbersForArray(array);
        averageValueOfAnArray(array);
    }    
}
