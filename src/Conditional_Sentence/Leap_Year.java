package Conditional_Sentence;
import java.util.Scanner;
// 1. 문제
//  : 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성
//    윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때다.

// 2. 유추파악
//  : 4의 배수이고 100의 배수가 아니면 --> 1 출력
//    4의 배수이고 100의 배수이거나 400의 배수가 아니면 --> 1 출력
//    4의 배수이고 400의 배수이면 --> 1 출력
//    4의 배수가 아니고 100의 배수이거나 400의 배수가 아니면 --> 0 출력

// 3. 주요 단어 영문 이름 선정
//   : 입력 - input
//     연도 - year
//     출력 - output

public class Leap_Year {
    public int year(int input) {
        int result;
        if(input%4 == 0 && input%400 == 0){
            result = 1;
        } else if(input%4 == 0 && input%100 != 0){
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // : 2000 -> 1
        //   2012 -> 1
        //   2000 -> 1
        //   1900 -> 0
        //   1999 -> 0

        // 5. 프로그래밍 순서
        // : 입력
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        // 처리
        Leap_Year main = new Leap_Year();
        int output = main.year(input);
        
        // 출력
        System.out.println(output);
    }
}
