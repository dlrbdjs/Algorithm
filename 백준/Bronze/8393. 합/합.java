import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < A + 1; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
