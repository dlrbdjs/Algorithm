import java.io.*;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.List.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        HashMap<Integer, Integer> xAxis = new HashMap<>();
        HashMap<Integer, Integer> yAxis = new HashMap<>();

        // 값 저장
        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (xAxis.containsKey(x)) {
                xAxis.put(x, xAxis.get(x) + 1);
            } else {
                xAxis.put(x, 1);
            }
            if (yAxis.containsKey(y)) {
                yAxis.put(y, yAxis.get(y) + 1);
            } else {
                yAxis.put(y, 1);
            }
        }
        
        // 1개만 있는 x 좌표 찾기
        for (Integer i : xAxis.keySet()) {
            if (xAxis.get(i) == 1){
                System.out.print(i);
                break;
            }
        }
        System.out.print(" ");
        
        // 1개만 있는 y좌표 찾기
        for (Integer i : yAxis.keySet()) {
            if (yAxis.get(i) == 1){
                System.out.print(i);
                break;
            }
        }
    }
}