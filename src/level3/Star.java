package level3;
import java.util.Scanner;
// 백준 2438
// 1. 문제 파악
//  첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//  N(1 ≤ N ≤ 100)

// 2. 유추 파악
//  입력받은 count로 첫째 줄 부터 별 1개씩 ++하여 count 횟수만큼
//  별 증가시켜 출력하기

// 3. 주요 단어 영문 이름 선정
//    입력 - input
//    출력 - output

public class Star {
    public String star(int input, int count) {
        String output = "";
        for(int i = 0; i < input; i++) {
            for(int j = 0; j < count; j++){
                output += "*";
            }
            if(i != input-1){
                output += "\n";
                count++;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 5 -->
        // *
        // **
        // ***
        // ****
        // *****

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 1;
        scanner.close();

        // 처리
        Star star = new Star();
        String result = star.star(input, count);

        // 출력
        System.out.println(result);
    }
}
