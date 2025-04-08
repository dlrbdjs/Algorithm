import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();

        int end_number = 666;
        int count = 0;

        // 일단 처음은 666으로 무조건 +1을 하게 함
        do {
            if (isEndNumber(end_number++)) {
                count++;
            }
        } while (count != N); // count == N 인 경우 정지

        System.out.println(--end_number);
    }

    // 어느 지점이던지 6 3개가 연속으로 나타나기만 하면 바로 true, 끝까지 안나오면 false
    public static boolean isEndNumber(int number) {
        String s = String.valueOf(number);

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == '6' && s.charAt(i + 1) == '6' && s.charAt(i + 2) == '6') {
                return true;
            }
        }
        return false;
    }
}