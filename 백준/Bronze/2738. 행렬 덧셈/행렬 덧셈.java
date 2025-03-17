import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int row = sc.nextInt();
        int col = sc.nextInt();

        List<List<Integer>> first = getOuterList(row, col);
        List<List<Integer>> second = getOuterList(row, col);
        getResult(first, second, row, col);

    }

    // 행렬 만들기
    public static List<List<Integer>> getOuterList(int row, int col) {
        List<List<Integer>> outerList = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                innerList.add(sc.nextInt());
            }
            outerList.add(innerList);
        }
        return outerList;
    }

    // 계산
    public static void getResult(List<List<Integer>> first, List<List<Integer>> second, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(first.get(i).get(j) + second.get(i).get(j));
                if (j != col - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}