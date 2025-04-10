import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];

        // 인덱스 번호가 입력 값인 곳에 개수 넣기 like 맵
        for (int i = 0; i < N; i++) {
            int inputValue = Integer.parseInt(br.readLine());
            cnt[inputValue]++;
        }

        // 카운트가 0 이상인 것들에 대해서 반복 출력
        for (int i = 0; i < 10001; i++) {
            if (cnt[i] != 0) {
                for (int j = 0; j < cnt[i]; j++) {
                    bw.write(i + "\n");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}