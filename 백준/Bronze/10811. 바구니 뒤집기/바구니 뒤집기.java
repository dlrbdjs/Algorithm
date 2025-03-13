import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bagCount = sc.nextInt();
        int tryCount = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < bagCount; i++) {
            list.add(i + 1);
        }

        for (int i = 0; i < tryCount; i++) {
            int firstIdx = sc.nextInt() - 1;
            int secondIdx = sc.nextInt() - 1;

            while (firstIdx != secondIdx + 1) {

                tempList.add(list.get(secondIdx));
                secondIdx--;
            }

            for (int j = 0; j < tempList.size(); j++) {
                list.set(firstIdx, tempList.get(j));
                firstIdx++;
            }
            tempList.clear();
        }

        for (int i = 0; i < bagCount; i++) {
            System.out.print(list.get(i));
            if (i != bagCount - 1) {
                System.out.print(" ");
            }
        }

    }
}

