package baekjoon.level1;
import java.util.Scanner;
// 1. 문제 파악
//  :  준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 
//     놀람(??!)을 표현하는 프로그램을 작성. 아이디는 알파벳 소문자로만, 길이는 50자 이내

// 2. 유추 파악
//  : 입력한 아이디에 ??!를 붙여서 출력

// 3. 주요 단어 영문 이름 선정
//  : 입력 - input
//    아이디 - id
//    출력 - output

public class PrintSign {
	// 입력한 아이디에 ??! 출력
	public String sign(String input) {
		String output_sign = (input + "??!");
		return output_sign;
	}
	public static void main(String[] args) {
		// 4. 테스트 케이스
		// joonas --> joonas??!
		// baekjoon --> baekjoon??!

		// 5. 프로그래밍 순서
		// 입력
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		// 처리
		PrintSign main = new PrintSign();
		String output = main.sign(input);

		// 출력
		System.out.println(output);
	}
}