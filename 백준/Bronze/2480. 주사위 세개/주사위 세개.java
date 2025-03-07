import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> diceList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            diceList.add(sc.nextInt());
        }
        long differentNumberCount = diceList.stream().distinct().count();

        if (differentNumberCount == 1) {
            System.out.println(10000 + 1000 * diceList.get(0));
        } else if (differentNumberCount == 2) {
            System.out.println(1000 + 100 * diceList.stream()
                    .filter(num -> Collections.frequency(diceList, num) == 2)
                    .findFirst()
                    .orElse(0));
        } else if (differentNumberCount == 3) {
            System.out.println(100 * diceList.stream().max(Integer::compareTo).get());
        }
    }
}
