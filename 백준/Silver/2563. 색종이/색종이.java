import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [][] resultArr = colorPaper();
        long count = getResult(resultArr);
        System.out.println(count);
    }

    public static int[][] colorPaper() {
        int[][] paper = new int[100][100];
        int repeat = sc.nextInt();
        for (int i = 0; i < repeat; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j-1][k-1] = 1;
                }
            }
        }
        return paper;
    }

    public static long getResult(int[][] arr){
        return Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .filter(num -> num == 1)
                .count();
    }
}