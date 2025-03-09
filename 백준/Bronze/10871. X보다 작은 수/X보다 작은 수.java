import java.net.Inet4Address;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        int userInput = sc.nextInt();
        int findNum = sc.nextInt();
        for (int i = 0; i < userInput; i++) {
            list.add(sc.nextInt());
        }
        list.stream()
                .filter(num -> num < findNum)
                .forEach(result::add);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}

