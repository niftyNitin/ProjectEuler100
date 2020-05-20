//Project Euler #9: Special Pythagorean triplet

import java.util.Scanner;

public class Euler009 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(pythagoreanTriplet(n));
        }
        in.close();
    }

    public static long pythagoreanTriplet(int n) {
        long max = -1, temp;
        int a, b, c;
        for (int i = 1; i <= n / 3; i++) {
            a = i;
            b = ((n * n) - (2 * n * a)) / ((2 * n) - 2 * a);
            c = n - a - b;
            if (a * a + b * b == c * c) {
                temp = a * b * c;
                if (temp > max)
                    max = temp;
            }
        }
        return max;
    }
}

