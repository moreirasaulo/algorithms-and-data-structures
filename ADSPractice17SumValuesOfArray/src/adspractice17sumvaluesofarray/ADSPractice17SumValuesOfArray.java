package adspractice17sumvaluesofarray;

import java.util.Arrays;

public class ADSPractice17SumValuesOfArray {

    static int[] array = new int[5];
    
    static int sumElementsOfIntArray(int[] intArray)
    {
        int sum = 0;
        for (int col = 0; col < intArray.length; col++) {
            sum = sum + intArray[col];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] array = {5, 2, 13, 8, 11};
        
        // Print the sum
        System.out.print("The sum of the following array " + Arrays.toString(array) + " is " + sumElementsOfIntArray(array));
        System.out.println();
    }
    
}
