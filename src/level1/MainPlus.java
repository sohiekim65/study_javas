package level1;
import java.util.Scanner;

/*
[ 백준 문제 풀이 순서 ]
1. 문제 파악
 : 두 정수 A와 B를 입력받은 다음, A+B를 출력
   입력값은 (0 < A, B　< 10) 따라야 한다.

2. 유추 파악
 : 두 정수를 입력해 합을 출력

3. 주요 단어 영문 이름 선정
 : 입력  --> input
   정수  --> decimal
   출력 --> output
   합 --> add, +, plus
*/

public class MainPlus {
    // 두 정수 합 구함.
    public int plus(int input_first, int input_second) {
        int output_plus = input_first + input_second;
        return output_plus;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        //  3 + 5  ---> 결과 8
        //  20 + 50 --> 결과 70
        //  –1 + 5 ---> 결과 error –1 때문에

        // 5. 프로그래밍 순서
        //  입력
        Scanner scanner = new Scanner(System.in);
        int input_first = scanner.nextInt();
        int input_second = scanner.nextInt();
        scanner.close();
    
        //  처리
        MainPlus main = new MainPlus();
        int output_plus = main.plus(input_first, input_second);

        //  출력
        System.out.println(output_plus);
    }
}