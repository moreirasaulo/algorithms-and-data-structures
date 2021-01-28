package adspractice06;

import java.util.Scanner;

public class ADSPractice06 {
    // Write a Java program to compute body mass index (BMI).
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Set the weight (in kg):");
        double kg = input.nextDouble();
        System.out.println("Set the height (in m):");
        double m = input.nextDouble();
        double bmi = kg / (m * m);
        System.out.printf("The Body Mass Index (BMI) is %.2f\n", bmi);
    }
    
}
