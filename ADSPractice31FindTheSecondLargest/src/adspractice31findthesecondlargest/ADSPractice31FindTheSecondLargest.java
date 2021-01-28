package adspractice31findthesecondlargest;
// Write a Java program to find the second largest and the second smallest elements in an array.

public class ADSPractice31FindTheSecondLargest {
    static int[] array = {54, 30, 98, 66, 50, 82, 25}; // 2nd largest: 82
    
    static int findThe2ndLargest(int[] array) {
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > largest) {
                largest = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }
    
    static int findThe2ndSmallest(int[] array) {
        int smallest = 999999999;
        int secondSmallest = 999999999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }
        return secondSmallest;
    }
    
    public static void main(String[] args) {
        System.out.println("The second largest number is " + findThe2ndLargest(array));
        System.out.println("The second smallest number is " + findThe2ndSmallest(array));
    }   
}
