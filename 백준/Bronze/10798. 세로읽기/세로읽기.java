import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int maxLength = 0;

    public static void main(String[] args) {

        List<List<Character>> outerList = getOuterList();
        getResult(outerList);
    }

    // 행렬 만들기
    public static List<List<Character>> getOuterList() {
        List<List<Character>> outerList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            List<Character> innerList = new ArrayList<>();

            String userInput = sc.next();
            if (maxLength < userInput.length()) {
                maxLength = userInput.length();
            }
            for (int j = 0; j < userInput.length(); j++) {
                innerList.add(userInput.charAt(j));
            }
            outerList.add(innerList);
        }
        return outerList;
    }

    // 계산
    public static void getResult(List<List<Character>> outerList) {
        List<Character> resultList = new ArrayList<>();
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (outerList.get(j).size() > i) {
                    resultList.add(outerList.get(j).get(i));
                }
            }
        }
        for (Character c : resultList) {
            System.out.print(c);
        }
    }

}