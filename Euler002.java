//Project Euler #2: Even Fibonacci numbers
import java.util.Scanner;

public class Euler002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long a=0,b=2;
            long c = 4 * b + a;
            long sum = a + b;
            do
            {                
                sum += c;              
                a=b;
                b=c;
                c = 4 * b + a;
            }
            while(c<=n);
        System.out.println(sum);
        }
        in.close();
    }
}
