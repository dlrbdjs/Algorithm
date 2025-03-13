import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        String s = sc.nextLine();
        String[] voca = s.split(" ");
        for (String string : voca) {
            if (!string.isBlank()) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}

