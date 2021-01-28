package adspractice20arraydetectspecificvalue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ADSPractice20ArrayDetectSpecificValue {

    static Scanner input = new Scanner(System.in);

    static void generateNumbersForArray(int[] array) {
        // insert some numbers in the array
        int min = 1;
        int max = 10;
        int range = max - min;
        for (int col = 0; col < array.length; col++) {
            array[col] = (int) (Math.random() * range) + min;
        }
    }

    static void checkNumber(int[] array, int number) {
        boolean foundNo = false;
        for (int col = 0; col < array.length; col++) {
            if (array[col] == number) {
                System.out.printf("Number %d was found!\n", number);
                foundNo = true;
            }
        }
        if (foundNo == false) {
            System.out.printf("This array doesn't contain number %d\n", number);
        }
    }

    public static void main(String[] args) {
        boolean toContinue = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (toContinue = true) {
            System.out.print("How many elements will have this array? ");
            int size = input.nextInt();
            int[] array = new int[size];
            System.out.println();
            generateNumbersForArray(array);
            System.out.printf("The array, containing %d elements, was generated.\nWhich number you would like to check? ", size);
            int number = input.nextInt();
            checkNumber(array, number);
            try
            {
                System.out.println("Would you like to play again? (Yy/Nn)");
                String answer = input.nextLine();               
                br.readLine();
                if (answer.equals("N") || answer.equals("n")) {
                    toContinue = false;
                }
            }
            catch(IllegalArgumentException ex)
            {
                System.out.println(ex.getMessage());
            }     
            catch(IOException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }
}
