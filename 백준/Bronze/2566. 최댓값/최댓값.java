import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<List<Integer>> list = getOuterList();
        List<Integer> resultList = getResult(list);
        System.out.println(resultList.get(0));
        System.out.println(resultList.get(1) + " " + resultList.get(2));
    }

    // 행렬 만들기
    public static List<List<Integer>> getOuterList() {
        List<List<Integer>> outerList = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                innerList.add(sc.nextInt());
            }
            outerList.add(innerList);
        }
        return outerList;
    }

    // 계산
    public static List<Integer> getResult(List<List<Integer>> list) {
        int max = 0;
        int rowIdx = 0;
        int colIdx = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max <= list.get(i).get(j)) {
                    max = list.get(i).get(j);
                    rowIdx = i + 1;
                    colIdx = j + 1;
                }
            }
        }
        return new ArrayList<>(Arrays.asList(max, rowIdx, colIdx));
    }
}