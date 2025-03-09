import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int userInput = sc.nextInt();
        for (int i = 0; i < userInput; i++) {
            list.add(sc.nextInt());
        }
        list.stream()
                .min(Integer::compareTo)
                .ifPresent(System.out::print);

        System.out.print(" ");

        list.stream()
                .max(Integer::compareTo)
                .ifPresent(System.out::print);
    }
}

