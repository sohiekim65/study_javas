package baekjoon.level4;
import java.util.Scanner;
// 백준 10818
// 1. 문제 파악
// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 출력
// N (1 ≤ N ≤ 1,000,000)

// 2. 유추 파악
// 입력받은 정수들의 최솟값과 최댓값 구하기

// 3. 주요 단어 영문 이름 선정
//  정수의 개수 - count
//  입력 - input
//  최솟값 - min
//  최댓값 - max
//  출력 - output

public class MinMax {
    public int min(int count, int input[]) {
        int min = input[0];
        for(int i = 0; i < count; i++){
            if(min > input[i]){
                min = input[i];
            }
        }
        return min;
    }
    public int max(int count, int input[]) {
        int max = input[0];
        for(int i = 0; i < count; i++){
            if(max < input[i]){
                max = input[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 5
        // 20 10 35 30 7  -->  7 35

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int input[] = new int[count];
        
        for(int i = 0; i < count; i++){
            input[i] = scanner.nextInt();
        }

        // 처리
        MinMax main = new MinMax();
        int output_min = main.min(count, input);
        int output_max = main.max(count, input);

        // 출력
        System.out.println(output_min + " " + output_max);
        scanner.close();

    }
}
