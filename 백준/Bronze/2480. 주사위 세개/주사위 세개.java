import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B && C == B) {
            System.out.println(10000 + 1000 * A);
        } else if (A == B) {
            System.out.println(1000 + 100 * A);
        } else if (C == B) {
            System.out.println(1000 + 100 * B);
        } else if (C == A) {
            System.out.println(1000 + 100 * A);
        } else {
            int temp = Math.max(A, B);
            temp = Math.max(temp, C);
            System.out.println(100 * temp);
        }
    }
}
