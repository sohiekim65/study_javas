package Iteration;
import java.util.Scanner;
// 1. 문제 파악
//    N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성
//    (1 <= N <= 9)

// 2. 유추 파악
//    N 정수를 입력받아 N*1부터 N*9까지의 구구단 출력

// 3. 주요 단어 영문 이름 선정
//    입력 - input
//    출력 - output

public class multipl_table {
    public static void main(String[] args) {
        // 4. 테스트 케이스
        //     2 --> 2 * 1 = 2
        //           2 * 2 = 4
        //           2 * 3 = 6
        //           2 * 4 = 8
        //           2 * 5 = 10
        //           2 * 6 = 12
        //           2 * 7 = 14
        //           2 * 8 = 16
        //           2 * 9 = 18

        // 5. 프로그래밍 순서
        //   입력
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        // 처리 및 출력
        for(int i = input; i <= input; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}
