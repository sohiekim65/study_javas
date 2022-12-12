package level1;
import java.util.Scanner;
// 1. 문제 파악
//  : 두 정수 A와 B를 입력받은 다음, A-B 출력

// 2. 유추 파악
//  : 두 정수를 입력해 뺄셈

// 3. 주요 단어 영문 이름 선정
//  : 입력 - input
//    정수 - demical
//    뺄셈 - minus, -
//    출력 - output

public class MinusAB {
    // 두 정수 뺄셈
    public int minus(int input_A, int input_B) {
        int output_minus = input_A - input_B;
        return output_minus;
    }
    public static void main(String[] args){
        // 4. 테스트 케이스
        // 3 2 --> 1
        // 1 1 --> 0

        // 5. 프로그래밍 순서
        // 입력
        Scanner scanner = new Scanner(System.in);
        int input_A = scanner.nextInt();
        int input_B = scanner.nextInt();
        scanner.close();
        
        // 출력
        // 첫째 줄에 A-B를 출력한다.
        MinusAB minusAB = new MinusAB();
        int output = minusAB.minus(input_A, input_B);
        System.out.println(output);
    }
}
