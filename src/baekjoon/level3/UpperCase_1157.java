package baekjoon.level3;
import java.util.Scanner;
// 1. 문제 파악
// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 
// 가장 많이 사용된 알파벳을 대문자로 출력. 
// 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력


// 2. 유추 파악
// 대소문자로 된 단어를 입력받아 가장 많이 사용된 알파벳을 대문자로 출력하고
// 많이 사용된 알파벳의 count가 중복될 경우 ?로 출력

// 3. 주요 단어 영문 이름 선정
// 입력 - input
// 출력 - output

public class UpperCase_1157 {
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // Mississipi --> ?
        // zZa --> Z
        // z --> Z
        // baaa --> A

        // 5. 프로그래밍 순서
        // 입력
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split("");
        scanner.close();

        for(int i = 0; i < input.length(); i++){
            System.out.println(array[i]);
        }
    }
}
