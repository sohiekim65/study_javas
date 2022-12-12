package level3;
import java.util.Scanner;
// 백준 2439
// 1. 문제 파악
//  첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//  하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력
//  N(1 ≤ N ≤ 100)

// 2. 유추 파악
//  입력받은 count로 첫째 줄 부터 별 1개씩 ++하여 count 횟수만큼
//  별 증가시켜 출력하는데 오른쪽 정렬한 별 출력

// 3. 주요 단어 영문 이름 선정
//    입력 - input
//    출력 - output

public class Star2 {
    public String star(int input, int count, int star_count) {
        String output = "";

        for(int i = 0; i < input; i++) {
            for(int j = 0; j < count; j++) {
                output += " ";
            }
            for(int k = 0; k < star_count; k++){
                output += "*";
            }
            if(i != input-1){
                output += "\n";
                count--;
                star_count++;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 5 -->
        //      *
        //     **
        //    ***
        //   ****
        //  *****

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = input-1;
        int star_count = 1;
        scanner.close();

        // 처리
        Star2 main = new Star2();
        String result = main.star(input, count, star_count);

        // 츨력
        System.out.println(result);
    }
}
