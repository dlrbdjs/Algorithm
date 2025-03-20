import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int userInput = sc.nextInt();
        int n = sc.nextInt();
        base(userInput, n);
    }

    public static void base(int userInput, int n) {
        List<Character> result = new ArrayList<>();
        while (userInput != 0) {
            int temp = userInput % n;
            userInput /= n;
            if (temp >= 10 && temp <= 35) {
                result.add((char) (temp + 55));
            } else {
                result.add((char) (temp + 48));
            }
        }

        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i));
        }
    }

}