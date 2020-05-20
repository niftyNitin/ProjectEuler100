//Project Euler #8: Largest product in a series

import java.util.Scanner;

public class Euler008 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            System.out.println(largestProduct(n, k, num));
        }
        in.close();
    }

    public static int largestProduct(int n, int k, String num) {
        int max = 0;
        for (int i = 0; i < n - k; i++) {
            int product = 1;
            for (int j = i; j < i + k; j++) {
                product *= Integer.parseInt(String.valueOf(num.charAt(j)));
            }
            if (product > max)
                max = product;
        }
        return max;
    }
}

