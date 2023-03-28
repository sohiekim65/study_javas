package baekjoon;
import java.util.Scanner;
// 백준 1712
// 1. 문제 파악
// 노트북 판매 대수에 상관없이 드는 고정비용 - A, 한 대의 노트북을 생산하는 데
// 드는 가변 비용 - B, 노트북 가격 - C이다. A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성
// 손익분기점이 존재하지 않으면 -1을 출력

// 2. 유추 파악
// 고정비용 A, 가변비용 B, 노트북 가격 C를 입력 받아 최초로 이익이 발생하는
// 판매량 출력. 존재하지 않으면 -1 출력.
// 고정비용 = 1000, 가변비용 = 70, 노트북가격 = 170이면 

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  고정비용 - A
//  가변비용 - B
//  책정가격 - C
//  판매량 - count
public class BreakEven {
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 1000 70 170  --> 11
        // 3 2 1  -->  -1
        // 2100000000 9 10 --> 2100000001

        // 찾고자 하는 것 : C * count > A + (B * count)
        // 총 비용과 총 수입이 같아지는 구간은 C * count = A + (B * count)이다.
        // (C * count) - (B * count) = A
        // count(C - B) = A
        // count = A/(C - B)로 정리할 수 있다. 
        // 근데 이것은 수입이 같아지는 구간이기 때문에 + 1을 해줘야 수익이 발생하는 지점이 나온다.
        
        // 손익분기점이 존재하지 않으면 -1을 출력해야 하는데
        // 손익분기점이 존재하지 않는 것은 가격이 가변비용보다 같거나 적은 수일 때다.(C <= B)
        // 손익분기점이 존재하는 것은 가격이 가변비용보다 높은 수일 때다.(C > B)

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        scanner.close();
        
        if(C > B){
            // 손익분기점 출력
            System.out.println((A/(C-B)) + 1);
        } else {
            // 손익분기점 존재하지 않을 때
            System.out.println(-1);
        }
    }
}
