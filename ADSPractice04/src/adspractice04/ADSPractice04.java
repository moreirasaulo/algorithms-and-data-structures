package adspractice04;
// Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

import java.util.Scanner;

public class ADSPractice04 {

    static Scanner input = new Scanner(System.in);
            
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 9999:");
        int number = input.nextInt();
        if(number < 0 || number > 9999){
            System.out.print("As I said before, the number should be between 0 and 9999.");
            return;
        }
        int firstNumber = number % 10;
        int remainingNumber = number / 10;
        int secondNumber = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdNumber = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthNumber = remainingNumber % 10;
        
        System.out.print("The sum of the digits of the entered number is " + (firstNumber + secondNumber + thirdNumber + fourthNumber));
    }    
}
