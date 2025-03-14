import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int lastIdx = input.length() - 1;
        int firstIdx = 0;
        int result = 2;
        while (firstIdx <= lastIdx) {
            if (input.charAt(firstIdx) != input.charAt(lastIdx)) {
                result = 0;
                break;
            } else {
                firstIdx++;
                lastIdx--;
                result = 1;
            }
        }
        System.out.print(result);

    }
}