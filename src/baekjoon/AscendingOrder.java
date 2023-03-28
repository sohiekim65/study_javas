package baekjoon;
import java.util.Arrays;
import java.util.Scanner;
// 백준 2750
// 1. 문제 파악
// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성
// 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 
// 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

// 2. 유추 파악
// N개의 수를 입력받아 이 수들을 오름차순으로 정렬한 결과 출력

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  출력 - output
public class AscendingOrder {
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 5  --> 1
        // 5      2
        // 2      3
        // 3      4
        // 4      5
        // 1

        // 5. 입력
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int input[] = new int[N];
        for(int i = 0; i < N; i++){
            input[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(input);

        for(int i = 0; i < N; i++){
            System.out.println(input[i]);
        }
    }
}
