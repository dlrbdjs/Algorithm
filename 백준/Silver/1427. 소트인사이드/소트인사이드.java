import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        int[] cnt = new int[10];

        // 인덱스 번호가 입력 값인 곳에 개수 넣기 like 맵
        for (int i = 0; i < N.length(); i++) {
            int inputValue = Integer.parseInt(String.valueOf(N.charAt(i)));
            cnt[inputValue]++;
        }

        // 카운트가 0 이상인 것들에 대해서 반복 출력
        for (int i = 9; i >= 0; i--) {
            if (cnt[i] != 0) {
                for (int j = 0; j < cnt[i]; j++) {
                    bw.write(String.valueOf(i));
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}