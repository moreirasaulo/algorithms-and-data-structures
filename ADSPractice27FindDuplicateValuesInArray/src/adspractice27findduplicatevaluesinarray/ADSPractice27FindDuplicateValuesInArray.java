package adspractice27findduplicatevaluesinarray;

public class ADSPractice27FindDuplicateValuesInArray {

    static int[] array = {85, 36, 58, 78, 65, 36, 13, 58}; // 36 and 58

    static void checkMatch(int[] array) {
        int a;
        boolean isMatch = false;
        for (int i = 0; i < array.length; i++) {
            a = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == a) {
                    System.out.println("The number " + a + " is a match!");
                    isMatch = true;
                }
            }
        }
        if (isMatch == false) {
            System.out.println("No match was found.");
        }
    }
    public static void main(String[] args) {
        checkMatch(array);
    }   
}


