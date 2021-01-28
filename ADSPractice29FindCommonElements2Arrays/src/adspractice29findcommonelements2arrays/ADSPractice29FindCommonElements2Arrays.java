package adspractice29findcommonelements2arrays;
// Write a Java program to find the common elements between two arrays (string values)

public class ADSPractice29FindCommonElements2Arrays {
    static String[] array1 = {"Apollon", "AEK", "Xanthi", "Lamia", "Atromitos"}; 
    static String[] array2 = {"AEK", "PAOK", "Larisa", "Olympiakos", "Panathinaikos", "Aris"}; // AEK
    
    static void checkMatch(String[] array1, String[] array2)
    {
        String a;
        boolean isMatch = false;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i].equals(array2[j]))
                {
                    a = array1[i];
                    System.out.println(a + " is a match!");
                    isMatch = true;
                }
            }
        }
        if(isMatch == false)
        {
            System.out.println("No match was found.");
        }
    }

    public static void main(String[] args) {
        checkMatch(array1, array2);
    }
    
}
