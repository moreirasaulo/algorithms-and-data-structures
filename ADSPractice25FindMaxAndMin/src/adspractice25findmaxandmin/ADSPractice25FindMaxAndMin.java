package adspractice25findmaxandmin;

import java.util.Arrays;

public class ADSPractice25FindMaxAndMin {

    static int findMinimum(int[] array) {
        int min = 10000000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static int findMaximum(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {12, 25, 51, 69};
        System.out.println("The minimum value of this array is " + findMinimum(array));
        System.out.println("The maximum value of this array is " + findMaximum(array));
    }
}
