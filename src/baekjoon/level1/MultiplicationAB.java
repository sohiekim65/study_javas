package level1;
import java.util.Scanner;
// 1. 문제 파악
//  : 두 정수 A와 B를 입력받은 다음, AxB 출력

// 2. 유추 파악
//  : 두 정수를 입력해 곱함

// 3. 주요 단어 영문 이름 선정
//  : 입력 - input
//    정수 - demical
//    곱합 - multiply, *
//    출력 - output
public class MultiplicationAB {
    // 두 정수 곱함
    public int multiply(int input_A, int input_B) {
        int output_multiply = input_A*input_B;
        return output_multiply;
    }
    public static void main(String[] args){
        // 4. 테스트 케이스
        // 1 2 --> 2
        // 3 4 --> 12
        
        // 5. 프로그래밍 순서
        // 입력
        Scanner scanner = new Scanner(System.in);
        int input_A = scanner.nextInt();
        int input_B = scanner.nextInt();
        scanner.close();
        
        // 처리
        MultiplicationAB main = new MultiplicationAB();
        int output = main.multiply(input_A, input_B);

        // 출력
        System.out.println(output);
    }
}