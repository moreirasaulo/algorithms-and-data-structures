package adspractice01;

import java.util.Scanner;

public class ADSPractice01 {

    static Scanner input = new Scanner (System.in);
    static int data[];
    
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        if(size < 1)
        {
            System.out.print("The value should be 1 or greater.");
            return;
        }
        
        // assigning the new array to data
        data = new int[size];
                
        for (int i = 0; i < data.length; i++) {
            // populating the array with random numbers
            data[i] = (int)(Math.random() * 100 + 1);
            // and printing... the i would be an empty string or a comma, depending if the i is 0 or not:
            System.out.printf("%s%d", i == 0 ? "" : ",", data[i]);
        }
    }    
}
