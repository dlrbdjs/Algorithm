import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 행렬 사이즈 입력
        int row = sc.nextInt();
        int col = sc.nextInt();

        // 체스판 입력
        char[][] chessBoard = getChessBoard(row, col);
        
        // 가장 적게 색칠하는 수 반환
        int result = getMinPaintingCount(chessBoard, row, col);
        
        // 출력
        System.out.println(result);
    }

    // 큰 체스판 생성
    public static char[][] getChessBoard(int row, int col) {

        char[][] chessBoard = new char[row][col];

        for (int i = 0; i < row; i++) {
            char[] rowOfChessBoard = new char[col];
            String userInput = sc.next();
            for (int j = 0; j < col; j++) {
                rowOfChessBoard[j] = userInput.charAt(j);
            }
            chessBoard[i] = rowOfChessBoard;
        }
        return chessBoard;
    }

    // 가장 작은 횟수 반환
    public static int getMinPaintingCount(char[][] chessBoard, int row, int col) {

        int startWhitePaintingCount, startBlackPaintingCount, result;
        int minResult = Integer.MAX_VALUE;

            for (int i = 0; i < row - 7; i++) {
                for (int j = 0; j < col - 7; j++) {
                    startWhitePaintingCount = getPaintingCount(chessBoard, i, j, 'W');
                    startBlackPaintingCount = getPaintingCount(chessBoard, i, j, 'B');
                    result = Math.min(startWhitePaintingCount, startBlackPaintingCount);
                    if (result < minResult) {
                        minResult = result;
                    }
                }
            }
        return minResult;
    }

    // 전체 체스판에서의 시작 주소를 입력받아, 8x8 사이즈의 체스판을 자르고, 그 체스판에 색칠한 횟수 반환
    public static int getPaintingCount(char[][] chessBoard, int startX, int startY, char firstPaintingColor) {

        int count = 0;
        char color = firstPaintingColor;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chessBoard[startX + i][startY + j] != color) {
                    count++;
                }
                if (j < 7 && color == 'W') {
                    color = 'B';
                } else if (j < 7){
                    color = 'W';
                }
            }
        }
        return count;
    }
}