import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long userInput = sc.nextInt()-1;
        long room = 1;
        for (long i = 1; userInput > 0; i++) {
            userInput -= 6 * i;
            room++;
        }
        System.out.println((int) room);
    }
}