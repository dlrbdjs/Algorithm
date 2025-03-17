import java.io.CharConversionException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int repeat = sc.nextInt();

        List<String> inputList = new ArrayList<>();
        List<Character> checkList = new ArrayList<>();
        char before = ' ';
        int count = 0;
        boolean flag = true;

        for (int i = 0; i < repeat; i++) {
            inputList.add(sc.next());
        }

        for (String s : inputList) {
            checkList.clear();
            for (char c : s.toCharArray()) {
                if(checkList.isEmpty()) {
                    flag = true;
                    before = c;
                    checkList.add(c);
                    continue;
                }
                if (c != before && !checkList.contains(c)) {
                    before = c;
                    checkList.add(c);
                } else if (c != before && checkList.contains(c)){
                    flag = false;
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
    }
}