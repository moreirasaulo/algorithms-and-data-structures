package adspractice30removeduplicates;

import java.util.Arrays;

public class ADSPractice30RemoveDuplicates {

    static int[] array = {11, 18, 25, 29, 31, 31, 44, 51, 58, 62, 62, 82, 90, 98};

    static void removeDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Original array: " + Arrays.toString(array));
        removeDuplicates(array);
        System.out.println("The new array: " + Arrays.toString(array));
    }
}
