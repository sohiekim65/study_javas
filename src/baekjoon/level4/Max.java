package baekjoon.level4;
import java.util.Scanner;
// 백준 2562
// 1. 문제 파악
// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값과 최댓값이 몇 번째 수인지 출력

// 2. 유추 파악
// 9개의 자연수를 입력받아 최댓값과 최대값의 순서를 출력

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  최댓값 - max
//  출력 - output

public class Max {
    public int max(int input[], int max, int index) {
        for(int i = 0; i < input.length; i++){
             if(max < input[i]){
                max = input[i];
            }
        }
        return max;
    }

    public int index(int input[], int max, int index) {
        for(int i = 0; i < input.length; i++){
             if(max < input[i]){
                index = i+1;
                max = input[i];
            }
        }
        return index;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 3       -->      85
        // 29               8
        // 38
        // 12
        // 57
        // 74
        // 40
        // 85
        // 61

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int input[] = new int[9];
        for(int i = 0; i < input.length; i++){
            input[i] = scanner.nextInt();
        }
        int max = 0;
        int index = 0;

        // 처리
        Max main = new Max();
        int output_index = main.index(input, max, index);
        int output_max = main.max(input, max, index);

        // 출력
        System.out.println(output_max + "\n" + output_index);
        scanner.close();
    }
}
