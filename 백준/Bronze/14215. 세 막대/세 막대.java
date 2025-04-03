import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> userInput = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt());

        // 정렬
        userInput.sort(Comparator.naturalOrder());

        // 가장 작은 두변의 합을 이용해 최대 밑변의 길이 정의
        int maxBottomSide = userInput.get(0) + userInput.get(1) - 1;

        // 최대 밑변의 길이보다 주어진 막대의 길이가 짧은 경우
        if (maxBottomSide > userInput.get(2)) {
            maxBottomSide = userInput.get(2);
        }

        // 결과 출력
        System.out.println(userInput.get(0) + userInput.get(1) + maxBottomSide);
    }
}