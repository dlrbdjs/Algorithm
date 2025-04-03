import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b + c == 180) {
            List<Integer> triangle = List.of(a, b, c);
            long distinctCount = triangle.stream()
                    .distinct()
                    .count();
            if (distinctCount == 1) {
                System.out.print("Equilateral");
            } else if (distinctCount == 2) {
                System.out.print("Isosceles");
            } else {
                System.out.print("Scalene");
            }
        } else {
            System.out.print("Error");
        }

    }
}