package adspractice28findstringduplicates;

public class ADSPractice28FindStringDuplicates {

    // Patolino and Bacurau
    static String[] array = {"Nicodemos", "Patolino", "Aureliano", "Bacurau", "Bacurau", "Patolino", "Safado"}; 
    
    static void checkMatch(String[] array)
    {
        boolean isMatch = false;
        String a;
        for (int i = 0; i < array.length; i++) {
            a = array[i];
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[j].equals(a))
                {
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
        checkMatch(array);
    }
    
}
