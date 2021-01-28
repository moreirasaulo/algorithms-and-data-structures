package adspractice10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ADSPractice10 {

    static Scanner input = new Scanner(System.in);
    static int[] data; // creating an array of type int called data
    static List<Integer> primeNumbers = new ArrayList<>();
    
    public static void main(String[] args) {
        try {
            System.out.println("Enter the size of the array (1 or greater):");
            int size = input.nextInt();
            if(size < 1) {
            System.out.println("Invalid input: The number should be 1 or greater.");
            return;
            }
            data = new int[size]; // Allocate 'data' array of int values of the size user requested.
            
            // define the range of random numbers 
            int max = 100;
            int min = 0;
            int range = max - min + 1;
            
            // populate the array with random numbers
            for (int i = 0; i < data.length; i++) {
                // formula: (int)(Math.random() * max - min) + min -> This way it includes 100
                data[i] = (int)(Math.random() * range) + min; // will generate numbers from 0 to 100                
            }
            
            System.out.println(Arrays.toString(data)); // Prints in one single line, comma separated
            
            // Print the prime numbers
            int addNo;
            // Loop to qualify a number as prime or not
            for(int j = 0; j < data.length; j++) {
                boolean isPrime = true;
                       
                for(int k = 2; k < data[j]; k++)
                {
                    if(data[j] % k == 0){
                    isPrime = false;
                    break;
                }
            }
            // If it's prime, add to the list            
            if(isPrime){
                addNo = data[j]; 
                primeNumbers.add(addNo);
            }            
        }
        System.out.println("Prime numbers: " + Arrays.toString(primeNumbers.toArray()));
            
        } 
        catch (InputMismatchException ex) { // Exception for when it should be integer and it's not
            System.out.println("Error: The value should be an integer.");        
        }     
    }
}
