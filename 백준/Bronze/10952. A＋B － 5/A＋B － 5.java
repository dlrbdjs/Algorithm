import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        List<Integer> list = new ArrayList<>();


        while (flag) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A == 0 && B == 0) {
                flag = false;
            } else {
                list.add(A + B);
            }
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
