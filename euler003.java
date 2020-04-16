import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long greatestPrime=1;
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            while(n % 2 == 0) {
                n /= 2;
                greatestPrime = 2;
            }

            for(long i=3; i<=Math.sqrt(n); i+=2) {
                while(n % i == 0) {
                    n /= i;
                    greatestPrime = i;
                }
            }

            if(n > greatestPrime)
                greatestPrime = n;

            System.out.println(greatestPrime);
        }
    }
}
