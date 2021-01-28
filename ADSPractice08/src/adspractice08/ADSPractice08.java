package adspractice08;
import java.util.Scanner;
// Write a Java program to break an integer into a sequence of individual digits.

public class ADSPractice08 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input 6 non-negative digits:");
        int sixDig = input.nextInt();
        int n1 = sixDig / 100000;
        int remainder = sixDig % 100000;
        int n2 = remainder / 10000;
        remainder = remainder % 10000;
        int n3 = remainder / 1000;
        remainder = remainder % 1000;
        int n4 = remainder / 100;
        remainder = remainder % 100;
        int n5 = remainder / 10;
        remainder = remainder % 10;
        int n6 = remainder;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
    }    
}
