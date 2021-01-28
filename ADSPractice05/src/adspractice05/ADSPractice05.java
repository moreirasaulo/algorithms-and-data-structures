package adspractice05;

import java.util.Scanner;
//Write a Java program to convert temperature from Fahrenheit to Celsius degree && 
//reads a number in inches, converts it to meters
public class ADSPractice05 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What you would like to do?\na) Convert °F to °C (Press '1')\nb) Convert inches to meters (Press '2')");
        int answer = input.nextInt();
        switch(answer)
        {
            case 1:
                System.out.println("Type the temperature in °F:");
                double tempF = input.nextDouble();
                double tempC = (tempF - 32) * 5/9;
                System.out.printf("%.2f °F is equivalent to %.2f\n", tempF, tempC);
                break;
            case 2:
                System.out.println("Type the value in inches:");
                double valIn = input.nextDouble();
                double valM = valIn / 39.37;
                System.out.printf("%.2f inches is equivalent to %.2f meters\n", valIn, valM);
                break;
            default:
                 System.out.println("Invalid input. Try again.");
        }
    }   
}
