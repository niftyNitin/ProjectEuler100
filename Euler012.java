import java.util.Scanner;

public class Euler012 {
    // static int MAX = 1000001;
    // static int factor[];

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int t = scanner.nextInt();
        // factor = new int[MAX];
        // factor[0] = 0;
        // generatePrimeFactors();
        for (int i = 1; i <= t; i++) {
            final int n = scanner.nextInt();
            System.out.println(triangleNumberFactor(n));
        }
        scanner.close();
    }

    private static int triangleNumberFactor(final int n) {
        int triangleNumber = 1;
        int factorCount = 0;
        int x = 1;
        while (factorCount < n) {
            factorCount = countDiv(triangleNumber);
            x++;
            triangleNumber += x;
        }
        return triangleNumber;
    }

    static int countDiv(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0)
                count++;
        }
        return count;
    }
}
// static void generatePrimeFactors() {
// factor[1] = 1;

// // Initializes all the positions with
// // their value.
// for (int i = 2; i < MAX; i++)
// factor[i] = i;

// // Initializes all multiples of 2 with 2
// for (int i = 4; i < MAX; i += 2)
// factor[i] = 2;

// // A modified version of Sieve of
// // Eratosthenes to store the
// // smallest prime factor that
// // divides every number.
// for (int i = 3; i * i < MAX; i++) {
// // check if it has no prime factor.
// if (factor[i] == i) {
// // Initializes of j starting from i*i
// for (int j = i * i; j < MAX; j += i) {
// // if it has no prime factor
// // before, then stores the
// // smallest prime divisor
// if (factor[j] == j)
// factor[j] = i;
// }
// }
// }
// }

// // function to calculate number of factors
// static int calculateNoOfFactors(int n) {
// if (n == 1)
// return 1;

// int ans = 1;

// // stores the smallest prime number
// // that divides n
// int dup = factor[n];

// // stores the count of number of times
// // a prime number divides n.
// int c = 1;

// // reduces to the next number after prime
// // factorization of n
// int j = n / factor[n];

// // false when prime factorization is done
// while (j != 1) {
// // if the same prime number is dividing n,
// // then we increase the count
// if (factor[j] == dup)
// c += 1;

// /*
// * if its a new prime factor that is factorizing n, then we again set c=1 and
// * change dup to the new prime factor, and apply the formula explained above.
// */
// else {
// dup = factor[j];
// ans = ans * (c + 1);
// c = 1;
// }

// // prime factorizes a number
// j = j / factor[j];
// }

// // for the last prime factor
// ans = ans * (c + 1);

// return ans;
// }
// }