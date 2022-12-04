package level4;
import java.util.Scanner;
// 백준 10807
// 1. 문제 파악
// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성
// 첫째 줄에 정수의 개수, 둘째 줄엔 정수들 나열, 셋째 줄엔 찾으려는 정수 v가 주어진다.
// N(1 ≤ N ≤ 100)

// 2. 유추 파악
// 첫째 줄 count만큼 둘째 줄에 정수를 입력받고 셋째 줄에 입력받은 정수들 중
// 찾으려는 정수 v를 입력하여 v의 총 개수를 구하기

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  정수의 개수 - input_count
//  찾는 정수 - v
//  찾는 정수 개수 - count
//  출력 - output

public class CountNum {
    public int count(Scanner scanner, int input_count, int input[]) {
        for(int i = 0; i < input.length; i++){
            input[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();
        int count = 0;
        for(int j = 0; j < input.length; j++) {
            if(input[j] == v){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 11
        // 1 4 1 2 4 2 4 2 3 4 4
        // 2  -->  3
        //
        // 11
        // 1 4 1 2 4 2 4 2 3 4 4
        // 5  -->  0

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int input_count = scanner.nextInt();
        int input[] = new int[input_count];

        // 처리
        CountNum main = new CountNum();
        int output = main.count(scanner, input_count, input);

        // 출력
        System.out.println(output);
    }
}
