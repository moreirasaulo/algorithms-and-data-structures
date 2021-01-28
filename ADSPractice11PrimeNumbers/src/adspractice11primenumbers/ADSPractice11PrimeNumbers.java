package adspractice11primenumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ADSPractice11PrimeNumbers {
    static List<Integer> primeNumbers = new ArrayList<>();

    public static void main (String[] args) {
 
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 5 numbers");
        for(int i = 0; i < 5; i++){
            array[i] = in.nextInt();
        }
        int primeCount = 0;
        System.out.println("These are the prime numbers:");
        int addNo;
        for(int j = 0; j < array.length; j++) {
            boolean isPrime = true;
            
            
            for(int k = 2; k < array[j]; k++)
            {
                if(array[j] % k == 0){
                isPrime = false;
                break;
                }
            }
                        
            if(isPrime){
                primeCount++;
                addNo = array[j]; 
                primeNumbers.add(addNo);
            }            
        }        
        System.out.print("Prime numbers: " + Arrays.toString(primeNumbers.toArray()));        
    }
}