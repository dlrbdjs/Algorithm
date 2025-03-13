import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        List<String> printList = new ArrayList<>();

        for (int i = 0; i < userInput; i++) {
            String stringInput = sc.next();
            int lastIdx = stringInput.length() - 1;
            printList.add(String.valueOf(stringInput.charAt(0))
                    + String.valueOf(stringInput.charAt(lastIdx)));
        }
        for (String s : printList) {
            System.out.println(s);
        }

    }
}

