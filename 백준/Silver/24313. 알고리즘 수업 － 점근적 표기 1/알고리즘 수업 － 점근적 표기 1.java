import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long a1 = sc.nextInt();
        long a0 = sc.nextInt();
        long c = sc.nextInt();
        long n0 = sc.nextInt();

        boolean flag = true;

        for (long i = n0; i < Integer.MAX_VALUE; i++) {
            if (a1 == 0) {
                break;
            } else {
                if (a1 * i + a0 > c * i) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}