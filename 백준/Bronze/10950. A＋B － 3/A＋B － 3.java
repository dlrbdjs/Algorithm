import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        List<Integer> solutionList = new ArrayList<>();

        for (int i = 0; i < A; i++) {
            int B = sc.nextInt();
            int C = sc.nextInt();
            solutionList.add(B + C);
        }
        for (Integer i : solutionList) {
            System.out.println(i);
        }
    }
}
