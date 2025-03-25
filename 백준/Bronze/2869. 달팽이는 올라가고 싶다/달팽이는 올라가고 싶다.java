import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double up = sc.nextInt();
        double down = sc.nextInt();
        double length = sc.nextInt();
        double day = 0;

        day = (length - up) / (up - down) + 1;
        day = Math.ceil(day);
        System.out.println((int) day);
    }
}