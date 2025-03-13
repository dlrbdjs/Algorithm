import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            int repeat = sc.nextInt();
            String s = sc.next();
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                result.append(String.valueOf(s.charAt(j)).repeat(repeat));
            }
            list.add(String.valueOf(result));
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}

