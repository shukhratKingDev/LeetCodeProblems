package dayproblems;

import java.util.Arrays;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        int[][] grid = {{13, 13}, {13, 13,}};
        System.out.println(equalPairs(grid));
    }

    // first solution with  97 ms runtime 49.2 mb memory
    public static int equalPairs(int[][] grid) {
        int counter = 0;
        for (int[] rows : grid) {
            for (int i = 0; i < grid.length; i++) {
                int[] tempArray = new int[rows.length];
                for (int j = 0; j < grid.length; j++) {
                    tempArray[j] = grid[j][i];
                }
                if (Arrays.equals(tempArray, rows)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}