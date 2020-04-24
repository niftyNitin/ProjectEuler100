// Project Euler #11: Largest product scanner * grid

import java.util.Scanner;

public class Euler011 {

    private static int greatestProduct(final int[][] grid) {
        int product;
        int maxProduct = 0;

        // checking horizontal
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 17; j++) {
                product = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
                if (product > maxProduct)
                    maxProduct = product;
            }
        }

        // checking vertical
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 20; j++) {
                product = grid[i][j] * grid[i + 1][j] * grid[i + 2][j] * grid[i + 3][j];
                if (product > maxProduct)
                    maxProduct = product;
            }
        }

        // checking diagonal top-left to bottom-right
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                product = grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3];
                if (product > maxProduct)
                    maxProduct = product;
            }
        }

        // checking diagonal top-right to bottom-left
        for (int i = 0; i < 17; i++) {
            for (int j = 3; j < 20; j++) {
                product = grid[i][j] * grid[i + 1][j - 1] * grid[i + 2][j - 2] * grid[i + 3][j - 3];
                if (product > maxProduct)
                    maxProduct = product;
            }
        }

        return maxProduct;
    }

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[][] grid = new int[20][20];
        for (int grid_i = 0; grid_i < 20; grid_i++) {
            for (int grid_j = 0; grid_j < 20; grid_j++) {
                grid[grid_i][grid_j] = scanner.nextInt();
            }
        }
        final int result = greatestProduct(grid);
        System.out.println(result);
        scanner.close();
    }
}