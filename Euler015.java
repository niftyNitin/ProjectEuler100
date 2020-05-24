// Project Euler #15: Lattice paths

import java.util.*;
import java.math.*;

public class Euler015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int p = (int) 1e9 + 7;
            BigInteger required = fact(BigInteger.valueOf(m + n)).divide(fact(BigInteger.valueOf(n)))
                    .divide(fact(BigInteger.valueOf(m))).mod(BigInteger.valueOf(p));
            System.out.println(required);
        }
        scanner.close();
    }

    public static BigInteger fact(BigInteger num) {
        if (num == BigInteger.ZERO)
            return BigInteger.ONE;

        return num.multiply(fact(num.subtract(BigInteger.ONE)));
    }
}