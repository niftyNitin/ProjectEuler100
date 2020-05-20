//Project Euler #5: Smallest multiple
import java.util.*;

public class Euler005 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int product = 1;
            for(int i = 2; i<=n; i++) {
                product = product * i / hcf(product, i);
            }
            System.out.println(product);
        }
        in.close();
    }

    public static int hcf(int a, int b) {
        int HCF = 1; 
        if(a < b) {
            for(int i = 2; i <= a; i++) {
                if(a % i == 0 && b % i == 0) {
                HCF = i;
                }
            }
        } else if(b < a) {
            for(int i = 2; i <= b; i++) {
                if(a % i == 0 && b % i == 0) {
                    HCF = i;
                }
            }
        } else {
            HCF = a;
        }
        return HCF;
    }
}
