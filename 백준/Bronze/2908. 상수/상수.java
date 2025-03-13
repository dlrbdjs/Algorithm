import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String first = sc.next();
        String second = sc.next();

        StringBuilder sbFirst = new StringBuilder();
        StringBuilder sbSecond = new StringBuilder();

        for (int i = 2; i >= 0; i--) {
            sbFirst.append(first.charAt(i));
            sbSecond.append(second.charAt(i));
        }
        if (Integer.parseInt(String.valueOf(sbFirst)) > Integer.parseInt(String.valueOf(sbSecond))) {
            System.out.println(sbFirst);
        } else {
            System.out.println(sbSecond);
        }
    }
}

