package adspractice23copyanarray;

import java.util.Arrays;

public class ADSPractice23CopyAnArray {

    static int[] originalArray = {12, 47, 55, 83, 99};

    static int[] copyAnArray(int[] originalArray) {
        int[] copiedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }
        return copiedArray;
    }

    public static void main(String[] args) {
        copyAnArray(originalArray);
        System.out.println("Copied array: " + Arrays.toString(copyAnArray(originalArray)));
    }
}
