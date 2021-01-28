package adspractice24insertanelementinspecpos;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ADSPractice24InsertAnElementInSpecPos {

    static int[] array = {15, 22, 36, 47, 58, 62};
    static Scanner input = new Scanner(System.in);

    static int[] addElementAt(int[] array, int element, int index) {
        if(index < 0 || index > array.length)
        {
            throw new ArrayIndexOutOfBoundsException("This index does not exist in the array");
        }
        array[index] = element;
        return array;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Here's the array: ");
            System.out.println(Arrays.toString(array));
            System.out.print("Insert the integer you would like to insert: ");
            int element = input.nextInt();
            System.out.println();
            System.out.print("Set the index you would like to insert " + element + ": ");
            int index = input.nextInt();
            System.out.println("Here's the new array: ");
            addElementAt(array, element, index);
            System.out.println(Arrays.toString(array));
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
