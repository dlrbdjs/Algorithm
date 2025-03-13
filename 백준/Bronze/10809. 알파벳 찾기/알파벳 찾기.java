import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> alphaData = new HashMap<>();
        for (char i = 'a'; i <= 'z'; i++) {
            alphaData.put(i, -1);
        }

        String userInput = sc.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            char c = userInput.charAt(i);
            if (alphaData.get(c) == -1){
                alphaData.put(c, i);
            }
        }

        for (Character c : alphaData.keySet()) {
            System.out.print(alphaData.get(c));
            if (alphaData.get(c) != 'z'){
                System.out.print(" ");
            }
        }
    }
}

