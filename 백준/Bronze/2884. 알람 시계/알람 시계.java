import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > 0){
            if (B < 45) {
                A -= 1;
                B += 15;
            } else {
                B -= 45;
            }
        } else {
            if (B < 45) {
                A = 23;
                B += 15;
            } else {
                B -= 45;
            }
        }
        System.out.print(A + " " + B);

    }
}
