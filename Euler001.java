//Project Euler #1: Multiples of 3 and 5
import java.util.*;

public class Euler001 {

    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = scanner.nextLong();
            long n1=0,n2=0,n3=0;
            n1 = (n-1)/3;
            n1 = 3*n1*(n1+1)/2;
            n2 = (n-1)/5;
            n2 = 5*n2*(n2+1)/2;
            n3 = (n-1)/15;
            n3 = 15*n3*(n3+1)/2;
            System.out.println(n1+n2-n3);
            scanner.close();
        }
    }
}
