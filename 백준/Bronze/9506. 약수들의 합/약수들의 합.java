import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int sum = 0;

        // 입력 값 저장
        List<Integer> inputList = new ArrayList<>();
        while (true) {
            int userInput = sc.nextInt();
            if (userInput == -1) {
                break;
            }
            inputList.add(userInput);
        }

        // 각 요소별 완전수 판단
        for (Integer i : inputList) {
            sum = 0;
            List<Integer> resultList = new ArrayList<>();
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                    resultList.add(j);
                }
            }

            // 출력
            if (sum == i) {
                System.out.print(i + " = ");
                for (int j = 0; j < resultList.size(); j++) {
                    System.out.print(resultList.get(j) + " ");
                    if (j != resultList.size() - 1) {
                        System.out.print("+ ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(i + " is NOT perfect.");
            }
        }
    }
}