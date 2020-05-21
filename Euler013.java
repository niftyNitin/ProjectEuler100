import java.util.*;

public class Euler013 {

    public static void main(String[] args) {
        int t;
        long sum = 0;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        List<String> numbers = new ArrayList<>();
        for(int i = 0; i <= t; i++){
            String str = scanner.nextLine();
            numbers.add(str);
        }

        for (int i = 1; i <= t; i++) {
            String s = numbers.get(i);
            sum += Long.parseLong(s.substring(0,11));
        }
        String sum10 = Long.toString(sum);
        System.out.println(sum10.substring(0,10));
        scanner.close();
    }
}