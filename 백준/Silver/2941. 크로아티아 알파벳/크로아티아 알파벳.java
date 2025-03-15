import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.next().split("");
        int count = 0;

        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i].equals("=")) {
                i--;
                if (i >= 0 && s[i].equals("z")) {
                    i--;
                    if (i >= 0 && s[i].equals("d")) { //dz=
                        count++;
                    } else {
                        i++;
                        count++;
                    }
                } else {
                    count++;
                }
            } else if (s[i].equals("-")) {
                i--;
                count++;
            } else if (s[i].equals("j")) {
                i--;
                if (i >= 0 && (s[i].equals("l") || s[i].equals("n"))) {
                    count++;
                } else {
                    i++;
                    count++;
                }
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}