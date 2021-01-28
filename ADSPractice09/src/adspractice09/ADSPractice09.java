package adspractice09;
import java.util.Scanner;
// Write a Java program to compute body mass index (BMI).

public class ADSPractice09 {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter the person's weight (in kg):");
        double kg = input.nextDouble();
        System.out.println("Enter the person's height (in m):");
        double m = input.nextDouble();
        
        double bmi = kg / (m * m);
        
        System.out.printf("This cabra(ita) BMI is %.2f\n", bmi);
    }    
}
