package baekjoon.level6;
import java.util.Scanner;
// 백준 2444
// 1. 문제 파악
// 예제를 보고 규칙을 유추한 뒤에 별 찍기


// 2. 유추 파악
// 입력한 숫자 N의 줄만큼 별을 찍은 뒤 역으로 별 찍어주기. 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  별 찍는 갯수 - count
//  출력 - output
public class DrawStar {
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 3 -->   *
        //        ***
        //       *****
        //        ***
        //         *

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 1;
        scanner.close();

        for(int i = 0; i < input; i++){
            for(int k = input-1; k > i; k--){
                System.out.print(" ");
            }
            for(int j = 0; j < count; j++){
                System.out.print("*");
            }
            count+=2;
            System.out.println("");
        }
        count-=4;   // 아래로 별을 찍기 위해
        for(int i = 0; i < input-1; i++){
            for(int k = 0; k <= i; k++){
                System.out.print(" ");
            }
            for(int j = count; j > 0; j--) {
                System.out.print("*");
            }
            count-=2;
            System.out.println("");
        }
    }
}
