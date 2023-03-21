package baekjoon.level7;
import java.util.Scanner;
// 백준 2839
// 1. 문제 파악
// 상근이가 배달하는 봉지의 최소 개수를 출력한다. 정확하게 N킬로그램을 만들 수 없다면 -1을 출력.
// 봉지는 3킬로그램, 5킬로그램 봉지가 있다. 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)

// 2. 유추 파악
// 입력한 수에 맞춰 봉지의 최소 개수를 계산해서 출력, 정확한 킬로그램이 안된다면 -1 출력

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  출력 - output

public class Sugar {
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 18 --> 4 (5kg 3개, 3kg 1개)
        // 4  --> -1
        // 6  --> 2 (3kg 2개)
        // 9  --> 3 (3kg 3개)
        // 11 --> 3 (5kg 1개, 3kg 2개)

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 0;

        while(true){
        // 무한 루프를 돌며 계산
            if(input % 5 == 0){
                // 5의 배수일 경우
                System.out.println(input/5 + count);
                break;
            } else if(input < 0) {
                // 0으로 떨어지지 않는 숫자들은 -1 출력
                System.out.println(-1);
                break;
            }
            // 최소한의 봉지 개수를 계산하기 위해 5의 배수가 아니면 3씩 빼준 뒤 결과가 5의 배수가 되면 if문으로 이동 후 출력
            input = input - 3;
            // 위에서 뺀 3kg 봉지 카운트 + 1
            count ++;
        }
        scanner.close();
    }
}
