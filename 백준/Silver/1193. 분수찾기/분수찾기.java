import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int userInput = sc.nextInt();
        int parent = 0;
        int child = 0;
        int swap = 0;
        int count = 0;
        boolean increase = true;
        int position = userInput;

        // 칸 구하기
        for (int i = 1; position - i > 0; i++) {
            position -= i;
            count++;
        }

        // 1, 2, 3, ... , 3, 2, 1
        int temp = count + 2;
        for (int i = 0; i < position; i++) {
            if (parent == temp) {
                increase = false;
            }
            if (increase) {
                parent++;
            } else {
                parent--;
            }
            child = temp - parent;
        }

        // 짝수 줄과 홀수 줄의 읽는 방식 우상향, 좌하향
        if (count % 2 == 0) {
            swap = parent;
            parent = child;
            child = swap;
        }

        // 출력
        System.out.println(parent + "/" + child);
    }
}