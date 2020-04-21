//Project Euler #6: Sum square difference

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Euler006 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextInt();
            System.out.println(absoluteDifference(n));
        }
    }

    public static long absoluteDifference(long n) {
        return sumSquare(n) - squareSum(n);
    }

    public static long squareSum(long n) {
        long sum = 0;
        sum = n * (n + 1) * (2 * n + 1) / 6;
        return sum;
    }

    public static long sumSquare(long n) {
        long sum = 0;
        sum = n * (n + 1) / 2;
        sum = sum * sum;
        return sum;
    }
}
