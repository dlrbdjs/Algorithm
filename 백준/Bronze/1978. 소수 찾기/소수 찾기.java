import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int repeat = sc.nextInt();
        int cnt = 0;
        boolean isPrime;

        // 입력 저장
        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < repeat; i++) {
            inputList.add(sc.nextInt());
        }

        // 소수 판단
        for (Integer i : inputList) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (i != 1 && isPrime) {
                cnt++;
            }
        }
        
        // 출력
        System.out.println(cnt);
    }
}