package level1;
import java.util.Scanner;
// 1. 문제 파악
//  : 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000). 
//    A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력

// 2. 유추 파악
//  : 두 자연수를 이용해 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 출력

// 3. 주요 단어 영문 이름 선정
//  : 입력 - input
//    자연수 - int
//    덧셈 - plus, +
//    뺄셈 - minus, -
//    나눗셈 - division, /
//    곱셈 - multiply, *
//    나머지 - remainder
//    출력 - output

public class Calculation {
    // 사칙연산의 결과값 구함
    public int plus(int inputA, int inputB) {
        int output_plus = inputA + inputB;
        return output_plus;
    }
    public int minus(int inputA, int inputB) {
        int output_minus = inputA - inputB;
        return output_minus;
    }
    public int multiply(int inputA, int inputB) {
        int output_multiply = inputA * inputB;
        return output_multiply;
    }
    public int division(int inputA, int inputB) {
        int output_division = inputA / inputB;
        return output_division;
    }
    public int remainder(int inputA, int inputB) {
        int output_remainder = inputA % inputB;
        return output_remainder;
    }
    public static void main(String[] args){
        // 4. 테스트 케이스
        //     7 3 --> 10
        //             4
        //             21
        //             2
        //             1

        // 5. 프로그래밍 순서
        // 입력
        Scanner scanner = new Scanner(System.in);
        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();
        scanner.close();

        // 처리
        Calculation calculation = new Calculation();
        int output_plus = calculation.plus(inputA, inputB);
        int output_minus = calculation.minus(inputA, inputB);
        int output_multiply = calculation.multiply(inputA, inputB);
        int output_division = calculation.division(inputA, inputB);
        int output_remainder = calculation.remainder(inputA, inputB);

        // 출력
        System.out.println(output_plus + "\n" + output_minus + "\n" + output_multiply + "\n" + output_division + "\n" + output_remainder);
    }
}
