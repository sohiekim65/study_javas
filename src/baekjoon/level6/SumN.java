package baekjoon.level6;
import java.util.Scanner;
// 백준 11720
// 1. 문제 파악
// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력
// 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100). 둘째 줄에 숫자 N개가 주어진다.

// 2. 유추 파악
// 입력받을 숫자의 개수를 첫번째로 입력받고 그 N개의 숫자를 모두 합한 값 구하기

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  출력 - output

public class SumN {
    public int sum(int count, String num) {
        int sum = 0;
        for(int i = 0; i < count; i++){
            // charAt은 아스키코드값을 반환해서 -'0'(-48)을 해줘야 입력받은 숫자 값 그대로 나옴
            sum += num.charAt(i)-'0';
        }
        return sum;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 1 
        // 1 --> 1
        // 5
        // 54321 --> 15
        // 11
        // 10987654321 --> 46

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String num = scanner.next();
        
        // 처리
        SumN main = new SumN();
        int output = main.sum(count, num);

        // 출력
        System.out.println(output);
    }
}
