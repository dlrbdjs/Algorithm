import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int repeat = sc.nextInt();
        int base = 2;
        for (int i = 0; i < repeat; i++) {
            base += (int) Math.pow(2, i);
        }
        double result = Math.pow(base, 2);
        System.out.println((int) result);
    }
}