import java.util.*;

public class Euler013 {

    public static void main(String[] args) {
        int t;
        long sum = 0;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        List<String> numbers = new ArrayList<>();
        for(int i = 0; i < t; i++){
            numbers.add(scanner.nextLine());
            String s = numbers.get(i);
            sum += Integer.parseInt(s.substring(0,9));
        }
        String sum10 = Long.toString(sum);
        System.out.println(sum10.substring(0,9));
        scanner.close();
    }
}