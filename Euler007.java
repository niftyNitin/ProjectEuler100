//Project Euler #7: 10001st prime

import java.util.Scanner;

public class Euler007 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] store = new int[t];
        int max = 0;
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            store[a0] = n - 1;
            if (n > max)
                max = n;
        }

        int[] primeChecker = new int[max];
        int[] primeNumbers = new int[max];

        primeChecker[0] = 2;
        primeNumbers[0] = 2;

        findPrime(primeChecker, primeNumbers, max);
        for (int i = 0; i < t; i++) {
            System.out.println(primeNumbers[store[i]]);
        }
        in.close();
    }

    public static void findPrime(int[] primeChecker, int[] primeNumbers, int max) {
        int end = 1;
        int x = 2;
        boolean condition;
        while (end < max) {
            x++;
            condition = true;
            for (int i = 0; i < end; i++) {
                primeChecker[i]--;
                if (primeChecker[i] == 0) {
                    primeChecker[i] = primeNumbers[i];
                    condition = false;
                }
            }

            if (condition) {
                primeChecker[end] = x;
                primeNumbers[end] = x;
                end++;
            }
        }
    }
}
