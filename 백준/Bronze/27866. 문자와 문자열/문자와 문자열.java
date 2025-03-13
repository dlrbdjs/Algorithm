import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();

        int idx = sc.nextInt() - 1;

        System.out.println(userInput.charAt(idx));

    }
}

