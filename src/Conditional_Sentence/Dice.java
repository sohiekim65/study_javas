package Conditional_Sentence;
import java.util.Scanner;
// 1. 문제 파악
// 주사위로 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
// 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
// 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  

// 2. 유추 파악
//  3개의 같은 정수 입력 받으면 --> 10000 + (input * 1000)
//  2개의 같은 정수 입력 받으면 --> 1000 + (input * 100)
//  모두 다른 정수 입력 받으면 --> Max(input) * 1000

// 3. 주요 단어 영문 이름 선정
//    입력 - input
//    최댓값 - Max
//    출력 - output

public class Dice {
    public static void main(String[] args) {
        // 4. 테스트     케이스
        //     3 3 6 --> 1300
        //     2 2 2 --> 12000
        //     6 2 5 --> 600

        // 5. 프로그래밍 순서
        //     입력
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int max = Math.max(C, (Math.max(A, B)));
        scanner.close();

        // 처리 및 출력
        if((A!=B) && (B!=C) && (C!=A)){
            System.out.println(max*100);
        } else if((A==B) && (B==C)){
            System.out.println(10000+(A*1000));
        } else {
            if(A==B){
                System.out.println(1000+(A*100));
            }else if(B==C){
                System.out.println(1000+(B*100));
            }else {
                System.out.println(1000+(C*100));
            }
        }
    }
}
