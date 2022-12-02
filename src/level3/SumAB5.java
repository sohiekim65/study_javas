package level3;
import java.util.Scanner;
// 백준 10952
// 1. 문제 파악
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성
// (0 < A, B < 10)

// 2. 유추 파악
// 두 정수를 입력받아 합한 결과값 출력, 마지막 줄 0 0은 아무것도 출력하지 않는다.

// 3. 주요 단어 영문 이름 선정
//    입력 - input
//    출력 - output

public class SumAB5 {
    public String sum(int inputA, int inputB) {
        Scanner scanner = new Scanner(System.in);
        String output = "";

        do {
            inputA = scanner.nextInt();
            inputB = scanner.nextInt();
            if(inputA != 0 && inputB != 0){
                output += inputA + inputB + "\n";
            }
        } while(inputA != 0 && inputB != 0);
        
        scanner.close();
        return output;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 1 1  --> 2
        // 2 3  --> 5
        // 3 4  --> 7
        // 9 8  --> 17
        // 5 2  --> 7
        // 0 0

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int inputA = 0;
        int inputB = 0;

        // 처리
        SumAB5 main = new SumAB5();
        String result = main.sum(inputA, inputB);

        // 출력
        System.out.println(result);
    }
}
