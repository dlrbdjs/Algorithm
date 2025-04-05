import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int inputNumber = N;
        int minResult = 1000000;

        // 브루트 포스
        while (inputNumber > 0) {
            inputNumber -= 1;
            if (isGenerator(inputNumber, N) && inputNumber < minResult) {
                minResult = inputNumber;
            }
        }
        
        // 출력
        if (minResult != 1000000) {
            System.out.println(minResult);
        } else {
            System.out.println(0);
        }
    }

    // 1st param이 2nd param의 생성자인지?
    public static boolean isGenerator(int generator, int generatedNumber) {
        int digitSum = getDigitSum(generator);
        return generator + digitSum == generatedNumber;
    }

    // N의 각 자리 수의 합 리턴
    public static int getDigitSum(int number) {
        int sum = 0;
        String str = String.valueOf(number);
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }
}