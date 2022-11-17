package Iteration;
import java.util.Scanner;
// 1. 문제 파악
//    두 정수 A와 B를 입력받은 다음,  "Case #x: "를 출력한 다음, A+B를 출력
//    (0 < A, B < 10)

// 2. 유추 파악
//    반복 횟수 N과 두 정수를 입력받아 Case #1~N을 붙인 합을 구한다.

// 3. 주요 단어 영문 이름 선정
//    입력 - input
//    출력 - output

public class Case1 {
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 5     --> Case #1: 2
        // 1 1   --> Case #2: 5
        // 2 3   --> Case #3: 7
        // 3 4   --> Case #4: 17
        // 9 8   --> Case #5: 7
        // 5 2

        // 5. 프로그래밍 순서
        //   입력
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int input_A = 0;
        int input_B = 0;
        int num = 1;
        int C = 0;

        for(int i = 1; i <= count; i++){
            input_A = scanner.nextInt();
            input_B = scanner.nextInt();
            System.out.println("Case #" + num + ": " + input_A + " + " + input_B + " = " + (input_A+input_B));
            num++;
        }
        scanner.close();
    }
}
