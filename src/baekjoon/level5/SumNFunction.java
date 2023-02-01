package baekjoon.level5;
import java.util.Scanner;
// 백준 15596
// 1. 문제 파악
// 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성
// Java: long sum(int[] a); (클래스 이름: Test)
// a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
// 리턴값: a에 포함되어 있는 정수 n개의 합

// 2. 유추 파악
// 함수를 이용하여 정수 n개의 합을 구하기

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  합 - sum
//  출력 - output

public class SumNFunction {
    // 함수만 구현
     long sum(int[] a) {
        long sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    // public static void main(String[] args) {
    //     // 입력
    //     Scanner scanner = new Scanner(System.in);
    //     int n = scanner.nextInt();
    //     int[] a = new int[n];
    //     int sum = 0;
    //     for(int i = 0; i < n; i++){
    //         a[i] = scanner.nextInt();
    //         sum += a[i];
    //     }
    //     System.out.println(sum);
    //     scanner.close();
    // }
}
