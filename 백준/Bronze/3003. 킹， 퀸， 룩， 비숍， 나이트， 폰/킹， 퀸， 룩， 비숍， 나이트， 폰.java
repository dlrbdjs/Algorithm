import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int king = sc.nextInt();
        int queen = sc.nextInt();
        int rook = sc.nextInt();
        int bishop = sc.nextInt();
        int knight = sc.nextInt();
        int pawn = sc.nextInt();

        int[] have = {king, queen, rook, bishop, knight, pawn};
        int[] chess = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < chess.length; i++) {
            System.out.print(chess[i] - have[i]);
            if (i != chess.length - 1) {
                System.out.print(" ");
            }
        }
    }

}

