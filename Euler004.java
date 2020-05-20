//Project Euler #4: Largest palindrome product
import java.util.*;

public class Euler004 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(largestPalindrome(n));
        }
        in.close();
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
                
                if (product % 11 != 0)
                    continue;
                
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
