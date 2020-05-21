// Project Euler #13: Large sum

import java.util.*;

public class Euler013 {

    public static void main(final String[] args) {
        int t;
        long sum = 0;
        final List<String> numbers = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for (int i = 0; i <= t; i++) {
            numbers.add(scanner.nextLine());
        }

        for (int i = 1; i <= t; i++) {
            sum += Long.parseLong((numbers.get(i)).substring(0, 11));
        }

        final String sum10 = Long.toString(sum);
        System.out.println(sum10.substring(0,10));
        scanner.close();
    }
}