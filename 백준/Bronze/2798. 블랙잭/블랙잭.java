import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int M = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int total = 0;

        // 입력
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        
        // NC3 조합 N개의 요소중 3개를 선택하는 경우의 수
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    total = list.get(i) + list.get(j) + list.get(k);
                    if (total <= M && total > max) {
                        max = total;
                    }
                }

            }
        }

        // 출력
        System.out.println(max);
    }
}