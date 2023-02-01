package baekjoon.level4;
import java.util.Scanner;
// 백준 8958
// 1. 문제 파악
// 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
// OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성

// 2. 유추 파악
// 첫째 줄에 테스트 케이스가 주어지고 문제를 맞았으면 O = 1점, O가 연속일 경우
// 1씩 증가하여 점수 출력. OXOO -> 1점+0점+1점+2점

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  테스트 케이스 - count
//  점수 - score
//  출력 - output

public class OX {
    public String score(Scanner scanner, int count, String input[]) {
        String output = "";
        for(int i = 0; i < count; i++){
            int result = 0;
            int score = 0;
            input[i] = scanner.next();
            for(int j = 0; j < input[i].length(); j++){
                if((input[i].charAt(j) == 'o') || (input[i].charAt(j) == 'O')){
                    score++;
                }else {
                    score = 0;
                }
                result += score;
            }
            output += result + "\n";
        }
        return output;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 5
        // OOXXOXXOOO        --> 10
        // OOXXOOXXOO        --> 9
        // OXOXOXOXOXOXOX    --> 7
        // OOOOOOOOOO        --> 55
        // OOOOXOOOOXOOOOX   --> 30

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String input[] = new String[count];

        // 처리
        OX main = new OX();
        String result = main.score(scanner, count, input);

        // 출력
        System.out.println(result);
        scanner.close();
    }
}
