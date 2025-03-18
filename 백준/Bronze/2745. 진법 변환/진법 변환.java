import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String userInput = sc.next();
        int n = sc.nextInt();
        base(userInput, n);
    }

    public static void base(String userInput, int n) {
        String[] user = userInput.split("");
        int[] userInt = Arrays.stream(user)
                .mapToInt(s -> s.charAt(0))
                .toArray();
        double num = 0;

        for (int i = user.length - 1; i >= 0; i--) {
            double pow = Math.pow(n, user.length - 1 - i);
            if (userInt[i] >= 'A' && userInt[i] <= 'Z') {
                num += (userInt[i] - 55) * pow;
            } else {
                num += (userInt[i] - 48) * pow;
            }
        }
        System.out.println((int) num);
    }

}