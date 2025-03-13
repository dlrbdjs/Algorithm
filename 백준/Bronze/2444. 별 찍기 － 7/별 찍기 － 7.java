import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        for (int i = 0; i < userInput; i++) {
            for (int j = userInput - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 0; i < userInput - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * userInput - 3; k > 2 * i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}