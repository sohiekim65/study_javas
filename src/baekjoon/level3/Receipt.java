package baekjoon.level3;
import java.util.Scanner;
// 1. 문제 파악
//  구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사
//  총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력, 일치하지 않는다면 No를 출력

// 2. 유추 파악
//  첫째 줄에 금액, 둘째 줄에 물건 종류 개수, 3~6번째 줄에 물건의 가격과 개수 입력하여
//  일치하면 Yes, 일치하지 않으면 No 출력 

// 3. 주요 단어 영문 이름 선정
//    입력 - input
//    총 금액 - result_price
//    물건 종류 개수 - count
//    물건의 가격 - a
//    물건의 개수 - b
//    출력 - output

public class Receipt {
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 260000 --> Yes
        // 4
        // 20000 5
        // 30000 2
        // 10000 6
        // 5000 8
        
        // 250000 --> No
        // 4
        // 20000 5
        // 30000 2
        // 10000 6
        // 5000 8
        
        // 5. 프로그래밍 순서
        //   입력
        Scanner scanner = new Scanner(System.in);
        int result_price = scanner.nextInt();
        int count = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;

        for(int i = 1; i <= count; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c += a*b;
        }

        if(c == result_price){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        scanner.close();
    }
}
