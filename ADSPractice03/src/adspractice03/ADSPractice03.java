package adspractice03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ADSPractice03 {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Input the time zone offset to GMT: ");
        int timeZoneChange = input.nextInt();
        
        // SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z"); Included date, time and zone
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
    }   
}
