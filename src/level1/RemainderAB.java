package level1;
import java.util.Scanner;
// 1. 문제 파악
//    (A+B)%C는 ((A%C) + (B%C))%C 와 같은가
//    (A×B)%C는 ((A%C) × (B%C))%C 와 같은가
//  : 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성
//    (2 ≤ A, B, C ≤ 10000)

// 2. 유추 파악
//  : 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C,
// 셋째 줄에 (A×B)%C, 넷째 줄에  ((A%C) × (B%C))%C 출력

// 3. 주요 단어 영문 이름 선정
//  : 입력 - input
//    세가지 수 - int
//    출력 - output

public class RemainderAB {
    public int output1(int input_A, int input_B, int input_C) {
        int output_1 = (input_A + input_B)%input_C;
        return output_1;
    }
    public int output2(int input_A, int input_B, int input_C) {
        int output_2 = ((input_A % input_C) + (input_B % input_C)) % input_C;
        return output_2;
    }
    public int output3(int input_A, int input_B, int input_C) {
        int output_3 = (input_A * input_B) % input_C;
        return output_3;
    }
    public int output4(int input_A, int input_B, int input_C) {
        int output_4 = ((input_A % input_C) * (input_B % input_C)) % input_C;
        return output_4;
    }
    public static void main(String[] args){
    	// 4. 테스트 케이스
        //    5 8 4 --> 1
        //              1
        //              0
        //              0
                
        // 5. 프로그래밍 순서
        //    입력
        Scanner scanner = new Scanner(System.in);
        int input_A = scanner.nextInt();
        int input_B = scanner.nextInt();
        int input_C = scanner.nextInt();
        scanner.close();

        // 처리
        RemainderAB main = new RemainderAB();
        int output1 = main.output1(input_A, input_B, input_C);
        int output2 = main.output2(input_A, input_B, input_C);
        int output3 = main.output3(input_A, input_B, input_C);
        int output4 = main.output4(input_A, input_B, input_C);

        // 출력
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
    }
}