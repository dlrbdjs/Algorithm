import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int max = 0;
        int idx = 0;

        for (int i = 0; i < 9; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < 9; i++) {
            if (max < list.get(i)) {
                max = list.get(i);
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx + 1);
    }
}

