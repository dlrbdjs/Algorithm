import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] userInput = sc.nextLine().split(" ");
        
        int A = Integer.parseInt(userInput[0]);
        int B = Integer.parseInt(userInput[1]);

        System.out.println(A + B);
        
    }
}