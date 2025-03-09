import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> stuList = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            stuList.add(i + 1);
        }
        for (int i = 0; i < 28; i++) {
            stuList.remove(stuList.indexOf(sc.nextInt()));
        }
        for (Integer i : stuList) {
            System.out.println(i);
        }
    }
}

