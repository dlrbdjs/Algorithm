import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bagCount = sc.nextInt();
        int tryCount = sc.nextInt();

        int[] bagArr = new int[bagCount];
        for (int i = 0; i < bagCount; i++) {
            bagArr[i] = i + 1;
        }

        for (int i = 0; i < tryCount; i++) {
            int startIdx = sc.nextInt();
            int endIdx = sc.nextInt();
            int temp = bagArr[endIdx - 1];
            bagArr[endIdx - 1] = bagArr[startIdx - 1];
            bagArr[startIdx - 1] = temp;
        }
        for (int i = 0; i < bagArr.length; i++) {
            System.out.print(bagArr[i]);
            if (i != bagCount - 1) {
                System.out.print(" ");
            }
        }
    }
}

