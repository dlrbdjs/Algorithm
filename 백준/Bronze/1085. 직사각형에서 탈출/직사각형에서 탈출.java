import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int minWidth = Integer.MAX_VALUE;
        int minHeight = Integer.MAX_VALUE;

        // 거리 계산
        minWidth = Math.min(w - x, x);
        minHeight = Math.min(h - y, y);

        // 비교 출력
        System.out.println(Math.min(minWidth, minHeight));
    }
}