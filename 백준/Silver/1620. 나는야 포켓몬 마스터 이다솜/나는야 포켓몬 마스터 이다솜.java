import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] userInput = sc.nextLine().split(" ");
        
        int problemCnt = Integer.parseInt(userInput[0]);
        int solutionCnt = Integer.parseInt(userInput[1]);

        HashMap<Integer, String> poketMapInt = new HashMap<>();
        HashMap<String, Integer> poketMapStr = new HashMap<>();
        for (int i = 0; i < problemCnt; i++) {
            String dogam = sc.nextLine();
            poketMapInt.put(i+1, dogam);
            poketMapStr.put(dogam, i+1);
        }

        List<String> poketList = new ArrayList<>();

        for (int i = 0; i < solutionCnt; i++) {
            String userFind = sc.nextLine();
            if(userFind.charAt(0) >= '1' && userFind.charAt(0) <= '9') {
                poketList.add(poketMapInt.get(Integer.parseInt(userFind)));
            } else {
                poketList.add(String.valueOf(poketMapStr.get(userFind)));
            }
        }
        for (String s : poketList) {
            System.out.println(s);
        }

    }
}
