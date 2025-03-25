import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        // 판단
        for (int i = 1; i < a + 1; i++) {
            if (a % i == 0) {
                cnt++;
            }
            
            // 결과 출력
            if (cnt == b) {
                System.out.println(i);
                break;
            }
        }
        // 결과 없음
        if (cnt != b) {
            System.out.println(0);
        }
    }
}