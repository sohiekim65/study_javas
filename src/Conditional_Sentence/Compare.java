package Conditional_Sentence;
import java.util.Scanner;
// 1. 문제 파악
//  : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성
//    A가 B보다 큰 경우에는 '>'를 출력한다.
//    A가 B보다 작은 경우에는 '<'를 출력한다.
//    A와 B가 같은 경우에는 '=='를 출력한다.
//    -10,000 ≤ A, B ≤ 10,000

// 2. 유추 파악
//  : 두 정수를 입력받아 값을 비교하여 >, <, == 중 알맞는 기호 출력

// 3. 주요 단어 영문 이름 선정
//   : 입력 - input
//     정수 - demical
//     출력 - output

public class Compare {
    public String compare(int input_A, int input_B) {
        String result;
        if(input_A > input_B){
            result = ">";
        } else if(input_A < input_B) {
            result = "<";
        } else {
            result = "==";
        }
        return result;
    }
        
    public static void main(String[] args) {
        // 4. 테스트 케이스
        //     1  2 --> <
        //     10 2 --> >
        //     5  5 --> ==
            
        // 5. 프로그래밍 순서
        // 입력
        Scanner scanner = new Scanner(System.in);
        int input_A = scanner.nextInt();
        int input_B = scanner.nextInt();
        scanner.close();

        // 처리
        Compare main = new Compare();
        String output = main.compare(input_A, input_B);
        
        // 출력
        System.out.println(output);
    }
}
