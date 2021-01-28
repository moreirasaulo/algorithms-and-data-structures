package day01arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Day01Arrays 
{
    static Scanner input = new Scanner(System.in);
    static int[] data;
            
    public static boolean isPrime(int val)
    {
        for(int i = 2; i <= val / 2; i++)
        {
            // condition for nonprime number
            if(val % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Enter the size of the array (1 or greater): ");
            int size = input.nextInt();
            if(size < 1)
            {
                System.out.println("Error: value must be 1 or greater");
                return;
            }
            data = new int[size];
            for(int i = 0; i < data.length; i++)
            {
                data[i] = (int)(Math.random() * 100 + 1);
            }
            for (int i = 0; i < data.length; i++) 
            {
                // the i would be an empty string or a comma, depending if the i is 0 or not:
                System.out.printf("%s%d", i == 0 ? "" : ",", data[i]);
            }
            System.out.println();
            boolean isFirst = true;
            for (int i = 0; i < data.length; i++) 
            {
                int val = data[i];
                if(isPrime(val))
                {
                    System.out.printf("%s%d", isFirst ? "" : ",", val);
                    isFirst = false;
                }
            }
            System.out.println();
        }          
        catch(InputMismatchException ex)
        {
            System.out.println("Error: integer input required");
        }        
    }
}
