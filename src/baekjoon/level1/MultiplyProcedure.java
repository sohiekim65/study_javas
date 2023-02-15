package baekjoon.level1;
import java.util.Scanner;
// 1. 문제 파악
//  : (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
//    (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

// 2. 유추 파악
//  : (2)의 일의 자리와 (1)을 곱하여 (3)을, (2)의 십의 자리와 (1)을 곱하여
//    (4)를, (2)의 백의 자리와 (1)을 곱하여 (4)를 출력

// 3. 주요 단어 영문 이름 선정
//   : 입력 - input
//     자연수 - int
//     출력 - output

public class MultiplyProcedure {
//    (2)의 일의 자리 --> (2)%10
//    (2)의 십의 자리 --> ((2)%100)/10
//    (2)의 백의 자리 --> (2)/100
    public int output1(int input_A, int input_B) {
        int output_1 = (input_B%10)*input_A;
        return output_1;
    }
    public int output2(int input_A, int input_B) {
        int output_2 = ((input_B%100)/10)*input_A;
        return output_2;
    }
    public int output3(int input_A, int input_B) {
        int output_3 = (input_B/100)*input_A;
        return output_3;
    }
    public int output4(int input_A, int input_B) {
        int result = input_A*input_B;
        return result;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        //    472 
        //    385 --> 2360
        //            3776
        //            1416
        //            181720
                
        // 5. 프로그래밍 순서
        // 입력
        Scanner scanner = new Scanner(System.in);
        int input_A = scanner.nextInt();
        int input_B = scanner.nextInt();
        scanner.close();

        // 처리
        MultiplyProcedure main = new MultiplyProcedure();
        int output1 = main.output1(input_A, input_B);
        int output2 = main.output2(input_A, input_B);
        int output3 = main.output3(input_A, input_B);
        int output4 = main.output4(input_A, input_B);

        // 출력
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
    }
}
