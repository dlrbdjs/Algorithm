import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        List<Integer> xAxis = new ArrayList<>();
        List<Integer> yAxis = new ArrayList<>();

        int userInput = sc.nextInt();

        for (int i = 0; i < userInput; i++) {
            xAxis.add(sc.nextInt());
            yAxis.add(sc.nextInt());
        }

        // 너비, 높이 구하기
        int width = getMaxValue(xAxis) - getMinValue(xAxis);
        int height = getMaxValue(yAxis) - getMinValue(yAxis);

        // 결과 출력
        System.out.println(width * height);
    }

    // 최소값
    public static int getMinValue(List<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        return min;
    }

    // 최대값
    public static int getMaxValue(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }
}