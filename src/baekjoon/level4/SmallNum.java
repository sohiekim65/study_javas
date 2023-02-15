package baekjoon.level4;
import java.util.Scanner;
// 백준 10871
// 1. 문제 파악
// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력
// (1 ≤ N, X ≤ 10,000)

// 2. 유추 파악
// 첫째 줄에 입력받을 정수의 개수 N개와 특정 정수 X를 입력받고
// 정수들 중 X보다 작은 수를 모두 출력하기

// 3. 주요 단어 영문 이름 선정
//  정수의 개수 - count
//  특정 정수 - X
//  수열 - A
//  출력 - output

public class SmallNum {
    public String small(Scanner scanner, int count, int X, int A[]) {
        String output = "";
        for(int i = 0; i < count; i++){
            A[i] = scanner.nextInt();
            if(A[i] < X){
                output += A[i] + " ";
            }
        }
        return output;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 10 5
        // 1 10 4 9 2 3 8 5 7 6  --> 1 4 2 3

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int X = scanner.nextInt();
        int A[] = new int[count];

        // 처리
        SmallNum main = new SmallNum();
        String output = main.small(scanner, count, X, A);

        // 출력
        System.out.println(output + " ");
        scanner.close();
    }
}
