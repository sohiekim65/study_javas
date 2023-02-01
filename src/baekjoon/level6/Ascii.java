package baekjoon.level6;
import java.util.Scanner;
// 백준 11654
// 1. 문제 파악
// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
// 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성

// 2. 유추 파악
// 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 주어지면 그에 맞는 아스키 코드값 출력하기

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  출력 - output

public class Ascii {
    public int ascii(char input) {
        int output = (int)input;
        return output;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // A --> 65
        // C --> 67
        // 0 --> 48
        // 9 --> 57
        // a --> 97
        // z --> 122

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        char input = scanner.nextLine().charAt(0);

        // 처리
        Ascii main = new Ascii();
        int result = main.ascii(input);

        // 출력
        System.out.println(result);
        scanner.close();
    }
}
