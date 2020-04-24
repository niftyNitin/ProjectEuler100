//Project Euler #10: Summation of primes

import java.util.Scanner;

public class Euler010 {

    public static void primeSum(final long[] VALUES) {

        for (int i = 2; i < 1000000; i++) {
            VALUES[i] = i;
        }

        for (int i = 2; i <= VALUES.length / 2; i++) {

            if (VALUES[i] == 0) {
                continue;
            }
            int num = 2 * i;

            while (num < 1000000) {
                if (num % i == 0) {
                    VALUES[num] = 0;
                }
                num = num + i;
            }
        }

        for (int i = 1; i <= 1000000; i++) {
            VALUES[i] = VALUES[i - 1] + VALUES[i];
        }
    }

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int t = scanner.nextInt();
        final long[] VALUES = new long[1000001];
        primeSum(VALUES);
        for (int a0 = 0; a0 < t; a0++) {
            final int n = scanner.nextInt();
            System.out.println(VALUES[n]);
        }
        scanner.close();
    }
}