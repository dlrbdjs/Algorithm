import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] userInput = br.readLine().split(" ");
            int A = Integer.parseInt(userInput[0]);
            int B = Integer.parseInt(userInput[1]);
            bw.write((A + B) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();



    }
}
