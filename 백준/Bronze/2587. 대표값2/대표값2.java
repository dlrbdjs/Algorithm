import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int sum = 0;
        int userInput;

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            userInput = sc.nextInt();
            arr[i] = userInput;
            sum += userInput;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(sum/5);
        System.out.println(arr[2]);
    }
}