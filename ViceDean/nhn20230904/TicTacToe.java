import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TicTacToe {

    // 보드 초기화
    private char[][] board = {
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' }
    };

    private boolean[] checkBlank; // 놓여진 칸인지
    private char turn; // 누구 턴인지 x, o

    public TicTacToe() { // 각각의 값 초기화
        checkBlank = new boolean[9];
        turn = 'x';
        System.out.println("TicTacToe game 시작");
        System.out.println("1. x, 2. o 순으로 진행 됩니다.");
        printBoard(); // 보드 표시
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    System.out.println(board[i][j]);
                    continue;
                }
                System.out.print(board[i][j] + "|");

            }
            System.out.println("");
            if (i < 2) {
                System.out.println("-----");
            }

        }
    }

    private boolean isChoiced(int choiced) { // 선택되었는지 체크
        if (checkBlank[choiced]) { // 해당칸이 선택되었다면
            return true; // true
        }
        return false;
    }

    private boolean allCheck() { // 모두 체크?
        for (int i = 0; i < 9; i++) {
            if (!checkBlank[i]) {
                return false;
            }
        }
        return true;
    }

    private void drawing(int choiced) {
        checkBlank[choiced] = true;

        board[choiced / 3][choiced % 3] = turn;

        if (turn == 'x') {
            turn = 'o';
        } else {
            turn = 'x';
        }
    }

    private boolean whoWinner() { // 승리 체크

        for (int i = 0; i < 3; i++) {
            if (((board[i][0] == board[i][1] && board[i][1] == board[i][2])
                    || (board[0][i] == board[1][i] && board[1][i] == board[2][i])) && board[i][i] != ' ') {
                System.out.println("축하합니다 승리자 : " + board[i][i]);
                return true;
            }
        }

        if (((board[0][0] == board[1][1] && board[1][1] == board[2][2])
                || (board[0][2] == board[1][1] && board[1][1] == board[2][0])) && board[1][1] != ' ') {
            return true;
        }

        return false;
    }

    public void gameStart() { // 게임 시작
        Scanner scanner = new Scanner(System.in); // 입력
        int choiceblank; // 선택된 공간
        while (true) {
            if (whoWinner()) { // 승자가 있다면
                System.out.println("경기 종료");
                break;
            }

            if (allCheck()) { // 모두 체크되었다면
                System.out.println("칸이 모두 체크 되었습니다.");
                System.out.println("무승부로 게임을 종료합니다.");
                break;
            }

            System.out.print("선택할 칸을 입력하세요(1~9) : "); // 선택할 칸 입력
            
            try { // 숫자만 입력받기
                choiceblank = scanner.nextInt(); // 입력받기
                choiceblank -= 1; // 인덱스 값으로 수정

                if (0 > choiceblank && choiceblank < 8) { // 이상의 값이 들어온다면
                    System.out.println("1~9의 숫자를 선택해주세요");
                    continue;
                }

                if (isChoiced(choiceblank)) {
                    System.out.println("이미 그려진 공간입니다. 다른 번호를 입력해주세요 !");
                    continue;
                }

                drawing(choiceblank);
                printBoard();
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력하세요");
                scanner.nextLine();
                continue;
            }

            // 나혼자 게임하기
            Random random = new Random();
            int r;
            while (true) {
                r = random.nextInt(8);
                if (isChoiced(r)) {
                    continue;
                } else {
                    drawing(r);
                    printBoard();
                    break;
                }
            }

        }
        scanner.close();
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.gameStart();
    }
}
