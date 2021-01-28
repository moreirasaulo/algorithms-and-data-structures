package adspractice18;

public class ADSPractice18 {
    
    static void printGrid()
    {
        int[][] grid = new int[10][10];
        
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.printf("%2d ", grid[row][col]);
            }
            System.out.println();
        }
    }
    // Se a gente não define os valores da array, eles serão todos zero.

    public static void main(String[] args) {
        printGrid();
    } 
}
