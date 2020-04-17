//Project Euler #4: Largest palindrome product
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(largestPalindrome(n));
        }
    }

    static int largestPalindrome(int n) {       
        // Initialize result 
        int max_product = 0; 
          
        for (int i = 999; i >= 100; i--) 
        { 
            for (int j = i; j >= 100; j--) 
            { 
                // calculating product of two  
                // n-digit numbers 
                int product = i * j; 
                if (product < max_product) 
                    break; 
                int number = product; 
                int reverse = 0; 
      
                // calculating reverse of product 
                // to check whether it is  
                // palindrome or not 
                while (number != 0) 
                { 
                    reverse = reverse * 10 + number % 10; 
                    number /= 10; 
                } 
      
                // update new product if exist and if 
                // greater than previous one 
                if (product == reverse && product > max_product && product<n) 
                    max_product = product; 
            } 
        } 
        return max_product; 
    } 
}
