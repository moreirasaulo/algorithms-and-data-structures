package adspractice07;

import java.util.Scanner;

/*
Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, 
the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum 
(smaller of the two integers).
*/

public class ADSPractice07 {

    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Type the first integer:");
        int num1 = input.nextInt();
        System.out.println("Type the second integer:");
        int num2 = input.nextInt();
        
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = sum / 2;
        
        if(num1 > num2)
        {
            int higher = num1;
            int min = num2;
            System.out.println("Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nAverage: " + 
                    average + "\nMaximum: " + higher + "\nMinimum " + min);
        }
        else if(num2 > num1)
        {
            int higher = num2;
            int min = num1;
            System.out.println("Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nAverage: " + 
                    average + "\nMaximum: " + higher + "\nMinimum " + min);
        }
        else
        {
            System.out.println("Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nAverage: " + average);
            System.out.println("No maximum or minimum are present: those numbers are the same.");
        }
    }  
}
