// Project Euler #16: Power digit sum

import java.math.BigInteger;
import java.util.Scanner;

public class Euler016 {

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int number = 0;
        long sum = 0;
        while (t-- > 0) {
            sum = 0;
            number = scanner.nextInt();
            BigInteger bb = new BigInteger("2").pow(number);
            String s = bb.toString();
            char c[] = s.toCharArray();
            for (char cc : c) {
                sum += (((int) cc) - 48);
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}