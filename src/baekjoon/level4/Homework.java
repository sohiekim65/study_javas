package level4;
import java.util.Arrays;
import java.util.Scanner;
// 백준 5597
// 1. 문제 파악
// 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호 출력
// n(1 ≤ n ≤ 30)

// 2. 유추 파악
// 28개의 숫자를 입력받아 1~30까지의 출석번호 중 빠진 숫자 출력하기

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  출력 - output

public class Homework {
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 3    -->  빠진 수 : 2 8
        // 1
        // 4
        // 5
        // 7
        // 9
        // 6
        // 10
        // 11
        // 12
        // 13
        // 14
        // 15
        // 16
        // 17
        // 18
        // 19
        // 20
        // 21
        // 22
        // 23
        // 24
        // 25
        // 26
        // 27
        // 28
        // 29
        // 30

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int input[] = new int[28];
        int num[] = new int[30];
        
        for(int i = 0; i < 28; i++){
            input[i] = scanner.nextInt();
        }

        for(int i = 1; i <= 30; i++){
            num[i-1] = i;
        }

        Arrays.sort(input);

        for(int i = 1; i <= 30; i++){
            if(input[i] != i){
                System.out.println(input[i]);
            }
        }
    }
}
