package adspractice15arraysumprimeno;

public class ADSPractice15ArraySumPrimeNo {
    
    // Function to check whether a number is prime or not
    public static boolean isPrime(int num)
    {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Function to count total number of pairs of elements whose sum is prime
    public static int numPairsWithPrimeSum(
        int[] arr, int n)
    {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (isPrime(sum)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        System.out.println(numPairsWithPrimeSum(arr, n));
    }
    
}
