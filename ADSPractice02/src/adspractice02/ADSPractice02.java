package adspractice02;

import java.util.Scanner;

public class ADSPractice02 
{

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        System.out.println("Input the number of minutes:");
            
        int minutes = input.nextInt();
        int years = minutes / 525600; // # of minutes in a year
        int days = (minutes % 525600) / 1440; // # of minutes in a day  
            
        System.out.println(minutes + " is equivalent to " + years + " years and " + days + " days");
    }
    
}
