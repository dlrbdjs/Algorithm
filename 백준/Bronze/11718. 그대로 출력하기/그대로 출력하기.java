import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        while (sc.hasNext()) {
            list.add(sc.nextLine());
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}

