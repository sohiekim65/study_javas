import java.util.Scanner;

/*
[ 백준 문제 풀이 순서 ]
1. 문제 파악
 : 두 정수 A와 B를 입력받은 다음, A+B를 출력
   입력값은 (0 < A, B　< 10) 따라야 한다.

2. 유추 파악
 : 첫째 줄에 두 정수를 입력해 합 출력한 갯수 출력
   두 정수를 입력해 합을 출력

3. 주요 단어 영문 이름 선정
 : 입력  --> input
   정수  --> decimal
   출력 --> output
   합 --> add, +
   출력 갯수 --> count
   
*/
public class MainAB {
    // 두 정수 합 구함.
    public int plus(int input_first, int input_second){
        int output_plus = input_first + input_second;
        return output_plus;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        //  3
        //  1 + 1  ---> 결과 2
        //  2 + 3 --> 결과 5
        //  3 + 4 --> 결과 7
        //  –1 + 5 ---> 결과 error –1 때문에

        // 5. 프로그래밍 순서
        // 입력
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int input_first;
        int input_second;

        // 처리 및 출력
        for(int i = 1; i <= count; i++){
            input_first = scanner.nextInt();
            input_second = scanner.nextInt();

            // 처리
            MainAB mainAB = new MainAB();
            int output_plus = mainAB.plus(input_first, input_second);
            System.out.println(output_plus);
        }
        scanner.close();
    }
}