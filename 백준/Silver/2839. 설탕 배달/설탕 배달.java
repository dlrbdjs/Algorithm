import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int N = sc.nextInt();

        // N에 대해서 5kg 포대로 담았을 때의 개수 정의역
        int maxFive = N / 5;
        // N에 대한 3kg 포대 정의역
        int maxThree = N / 3;
        // 그냥 최소값
        int min = Integer.MAX_VALUE;

        // 3x + 5y = N을 만족시키는 모든 순서쌍 중에서
        // 그 순서쌍 요소의 합이 가장 작은 것을 반환
        for (int i = 0; i <= maxThree; i++) {
            for (int j = 0; j <= maxFive; j++) {
                if ((3 * i + 5 * j == N) && min > i + j) {
                    min = i + j;
                }
            }
        }

        // 반환된 것이 있는가 없는가에 따른 출력 분기분
        if (min != Integer.MAX_VALUE) {
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}