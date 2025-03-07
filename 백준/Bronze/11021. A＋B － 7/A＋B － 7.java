import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            list.add(A + B);
        }
        for (int i = 0; i < count; i++) {
            System.out.println("Case #" + (i + 1) + ": " + list.get(i));
        }
    }
}
