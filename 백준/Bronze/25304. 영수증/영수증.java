import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int itemCount = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < itemCount; i++) {
            int Price = sc.nextInt();
            int Quantity = sc.nextInt();
            sum += (Price * Quantity);
        }
        if (total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
