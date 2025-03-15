import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<List<Integer>> outerList = new ArrayList<>();

        StringBuilder sb = new StringBuilder(sc.next());

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') {
                sb.setCharAt(i, (char) (sb.charAt(i) - 32));
            }
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            if (map.containsKey(sb.charAt(i))) {
                map.put(sb.charAt(i), map.get(sb.charAt(i)) + 1);
            } else {
                map.put(sb.charAt(i), 1);
            }
        }

        for (Character c : map.keySet()) {
            List<Integer> cnt = new ArrayList<>();
            cnt.add(map.get(c));
            int temp = c;
            cnt.add(temp);
            outerList.add(cnt);
        }
        int max = 0;
        int count = 0;
        char alphabet = ' ';
        for (List<Integer> list : outerList) {
            if (max < list.get(0)) {
                max = list.get(0);
                int temp = list.get(1);
                alphabet = (char) temp;
                count = 1;
            } else if (max == list.get(0)) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println(alphabet);
        } else {
            System.out.println("?");
        }
    }
}