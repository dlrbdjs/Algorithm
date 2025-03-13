import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int lengthInput = sc.nextInt();
        String userInput = sc.next();

        for (int i = 0; i < lengthInput; i++) {
            sum += Integer.parseInt(String.valueOf(userInput.charAt(i)));
        }
        System.out.println(sum);
    }
}

