import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 정지 조건
            if (a == 0 && b == 0) {
                break;
            }

            // 판별
            if ((b % a) == 0) {
                System.out.println("factor");
            } else if ((a % b) == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}