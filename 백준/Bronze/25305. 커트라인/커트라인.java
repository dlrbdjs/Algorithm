import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int repeat = sc.nextInt();
        int cutLine = sc.nextInt();

        int userInput;

        int[] arr = new int[repeat];
        for (int i = 0; i < arr.length; i++) {
            userInput = sc.nextInt();
            arr[i] = userInput;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(arr[cutLine - 1]);
    }
}