import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        long distinctCnt;
        List<List<Integer>> userInputs = new ArrayList<>();
        
        // 입력
        while (true) {
            List<Integer> userInput = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt());
            if (userInput.get(0) == 0) {
                break;
            } else {
                userInput.sort(Collections.reverseOrder());
                userInputs.add(userInput);
            }
        }
        
        // 판단
        for (List<Integer> userInput : userInputs) {
            // 삼각형이 아님
            if (userInput.get(0) >= (userInput.get(1) + userInput.get(2))) {
                System.out.println("Invalid");
                continue;
            }

            distinctCnt = userInput.stream()
                    .distinct()
                    .count();

            // 정삼각형
            if (distinctCnt == 1) {
                System.out.println("Equilateral");
                continue;
            }

            // 이등변 삼각형
            if (distinctCnt == 2) {
                System.out.println("Isosceles");
                continue;
            }

            // 그냥 삼각형
            System.out.println("Scalene");
        }
    }
}