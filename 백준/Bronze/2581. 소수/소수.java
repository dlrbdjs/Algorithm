import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean isPrime;
        
        List<Integer> resultList = new ArrayList<>();

        // 소수 판단
        for (int i = start; i <= end; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (i != 1 && isPrime) {
                if (min > i) {
                    min = i;
                }
                resultList.add(i);
                sum += i;
            }
        }

        // 출력
        if(min == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}