package baekjoon.level1;
import java.util.Scanner;
// 1. 문제 파악
//  : 흰색 피스가 개수가 주어졌을 때 올바른 세트가 되도록 출력
//    체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 
//    비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
//    (0 <= A <= 10)

// 2. 유추 파악
//  : 입력 값에 올바른 세트가 되도록 더하거나 빼고 부호 반대로

// 3. 주요 단어 영문 이름 선정
//  : 입력 - input
//    king - king
//    queen - queen
//    rook - rook
//    bishop - bishop
//    knight - knight
//    pawn - pawn
//    출력 - output

public class Chess {
    // 올바른 세트가 되도록 -1 -1 -2 -2 -2 -8 뺄셈
    public int king(int king, int input_king) {
        int output_king = king - input_king;
        return output_king;
    }
    public int queen(int queen, int input_queen) {
        int output_queen = queen - input_queen;
        return output_queen;
    }
    public int rook(int rook, int input_rook) {
        int output_rook = rook - input_rook;
        return output_rook;
    }
    public int bishop(int bishop, int input_bishop) {
        int output_bishop = bishop - input_bishop;
        return output_bishop;
    }
    public int knight(int knight, int input_knight) {
        int output_knight = knight - input_knight;
        return output_knight;
    }
    public int pawn(int pawn, int input_pawn) {
        int output_pawn = pawn - input_pawn;
        return output_pawn;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        //   0 1 2 2 2 7 --> 1 0 0 0 0 1
        //   2 1 2 1 2 1 --> -1 0 0 1 0 7

        // 5. 프로그래밍 순서
        // 입력
        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;
        Scanner scanner = new Scanner(System.in);
        
        int input_king = scanner.nextInt();
        int input_queen = scanner.nextInt();
        int input_rook = scanner.nextInt();
        int input_bishop = scanner.nextInt();
        int input_knight = scanner.nextInt();
        int input_pawn = scanner.nextInt();

        scanner.close();

        // 처리
        Chess main = new Chess();
        int output_1 = main.king(king, input_king);
        int output_2 = main.queen(queen, input_queen);
        int output_3 = main.rook(rook, input_rook);
        int output_4 = main.bishop(bishop, input_bishop);
        int output_5 = main.knight(knight, input_knight);
        int output_6 = main.pawn(pawn, input_pawn);
        
        // 출력
        System.out.print(output_1 + " " +output_2 + " " + output_3 + " " + output_4 + " " + output_5 + " " + output_6);
    }
}
