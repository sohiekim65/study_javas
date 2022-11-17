package Conditional_Sentence;
import java.util.Scanner;
// 1. 문제 파악
//    점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성
//    (−1000 ≤ x ≤ 1000; x ≠ 0), (−1000 ≤ y ≤ 1000; y ≠ 0)

// 2. 유추 파악
//    두 정수를 입력받아 좌표가 해당하는 사분면 영역을 1~4 숫자로 출력

// 3. 주요 단어 영문 이름 선정
//    입력 - input
//    정수 - demical
//    출력 - output
//    사분면 - quadrant

public class Quadrant {
    public int quadrant(int input_A, int input_B) {
        int result;
        if(input_A >= 0 && input_B >= 0){
            result = 1;
        } else if(input_A < 0 && input_B >= 0){
            result = 2;
        } else if(input_A < 0 && input_B < 0){
            result = 3;
        } else {
            result = 4;
        }
        return result;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        //   12 5 --> 1
        //   9 -13 --> 4

        // 5. 프로그래밍 순서
        //  : 입력
        Scanner scanner = new Scanner(System.in);
        int input_A = scanner.nextInt();
        int input_B = scanner.nextInt();
        scanner.close();

        // 처리 
        Quadrant main = new Quadrant();
        int output = main.quadrant(input_A, input_B);

        // 및 출력
        System.out.println(output);
    }
}
