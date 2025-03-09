import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int userInput = sc.nextInt();
        for (int i = 0; i < userInput; i++) {
            list.add(sc.nextInt());
        }
        int find = sc.nextInt();
        System.out.println(list.stream().filter(num -> num == find).count());
    }
}
