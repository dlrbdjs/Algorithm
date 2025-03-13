import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int max = 0;
        int userInput = sc.nextInt();

        for (int i = 0; i < userInput; i++) {
            int score = sc.nextInt();
            if (score > max) {
                max = score;
            }
            sum += score;
        }
        System.out.println((double) sum / max * 100 / userInput);

    }
}

