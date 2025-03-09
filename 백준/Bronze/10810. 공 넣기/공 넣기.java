import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bagCount = sc.nextInt();
        int tryCount = sc.nextInt();

        int[] bagArr = new int[bagCount];

        for (int i = 0; i < tryCount; i++) {
            int startIdx = sc.nextInt();
            int endIdx = sc.nextInt();
            int inputNum = sc.nextInt();
            int temp = startIdx;

            for (int j = 0; j < endIdx - temp + 1; j++) {
                bagArr[startIdx - 1] = inputNum;
                startIdx++;
            }
        }
        for (int i = 0; i < bagArr.length; i++) {
            System.out.print(bagArr[i]);
            if (i != bagCount - 1) {
                System.out.print(" ");
            }
        }
    }
}

