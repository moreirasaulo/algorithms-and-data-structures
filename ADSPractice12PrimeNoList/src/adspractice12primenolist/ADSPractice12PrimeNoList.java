package adspractice12primenolist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ADSPractice12PrimeNoList {

    public static void main (String[] args) {
 
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 5 numbers");
        for(int i = 0; i < 5; i++){
            array[i] = in.nextInt();
        }
        
        System.out.print("These are the prime numbers: ");
        
        String comma = "";
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
                System.out.print(comma + array[j]);
                comma = ", ";
            }            
        }                
        System.out.println();
    }    
}