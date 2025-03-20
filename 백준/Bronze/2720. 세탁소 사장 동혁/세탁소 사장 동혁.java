import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int repeat = sc.nextInt();
        List<Integer> money = userInput(repeat);
        exchange(money);

    }

    public static List<Integer> userInput(int repeat) {
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < repeat; i++) {
            numList.add(sc.nextInt());
        }
        return numList;
    }

    public static void exchange(List<Integer> money) {
        for (Integer num : money) {
            int quarter = num / 25;
            num -= (quarter * 25);
            int dime = num / 10;
            num -= (dime * 10);
            int nickel = num / 5;
            num -= (nickel * 5);
            int penny = num % 5;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}