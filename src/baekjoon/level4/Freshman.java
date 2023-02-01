package baekjoon.level4;
import java.util.Scanner;
// 백준 4344
// 1. 문제 파악
// 첫째 줄에는 테스트 케이스의 개수 C가 주어지고 둘째 줄에는 학생의 수 N과 N명의 점수가 주어진다. 
// 각 케이스마다 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력.
// N(1 ≤ N ≤ 1000, N은 정수)

// 2. 유추 파악
// 각 줄마다 주어지는 N명의 점수에서 평균을 넘는 학생들의
// 비율을 반올림하여 소수점 셋째 자리까지 출력하기

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  테스트 케이스 - testCase
//  학생의 수 - count
//  출력 - output

public class Freshman {

    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 5
        // 5 50 50 70 80 100               --> 40.000%
        // 7 100 95 90 80 70 60 50         --> 57.143%
        // 3 70 90 80                      --> 33.333%
        // 3 70 90 81                      --> 66.667%
        // 9 100 99 98 97 96 95 94 93 91   --> 55.556%

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for(int i = 0; i < testCase; i++){
            int n = scanner.nextInt();
            int score[] = new int[n];
            double sum = 0;
            for(int j = 0; j < n; j++){
                score[j] = scanner.nextInt();
                sum += score[j];
            }

            double avg = sum/n;
            double count = 0;
            for(int k = 0; k < n; k++){
                if(score[k] > avg){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/n)*100);
        }
        scanner.close();
    }
}
