package Calculation_IO;
import java.util.Scanner;
// 1. 문제 파악
//  : 두 정수 A와 B를 입력받은 다음, A/B 출력
//    실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

// 2. 유추 파악
//  : 두 정수를 입력해 나눔
//    int가 아닌 double 사용 필요

// 3. 주요 단어 영문 이름 선정
//  : 입력 - input
//    정수 - demical
//    나눔 - division, /
//    출력 - output

public class DivisionAB {
    // 두 정수 나눈 값 구함.
    public double division(double double_A, double double_B) {
        double output_division = double_A / double_B;
        return output_division;
    }
    public static void main(String[] args){
        // 4. 테스트 케이스
        // 1 3 --> 0.33333333333333333333333333333333
        // 4 5 --> 0.8

        // 5. 프로그래밍 순서
        // 입력
        Scanner scanner = new Scanner(System.in);
        double double_A = scanner.nextDouble();
        double double_B = scanner.nextDouble();
        scanner.close();

        // 처리
        DivisionAB main = new DivisionAB();
        double output = main.division(double_A, double_B);

        // 출력
        // 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
        System.out.println(output);
    }
}