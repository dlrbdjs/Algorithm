import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            List<Integer> innerList = new ArrayList<>();
            int A = sc.nextInt();
            int B = sc.nextInt();
            innerList.add(A);
            innerList.add(B);
            innerList.add(A + B);
            list.add(innerList);
        }
        for (int i = 0; i < count; i++) {
            System.out.println("Case #" + (i + 1) + ": " + list.get(i).get(0) + " + " + list.get(i).get(1) + " = " + list.get(i).get(2));
        }
    }
}
