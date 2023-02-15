package baekjoon.level1;
import java.util.Scanner;
// 1. 문제 파악
//  : 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성
//    (1000 ≤ y ≤ 3000)

// 2. 유추 파악
//  : 불기 연도에 543을 뺄셈하여 서기 연도로 바꾸기

// 3. 주요 단어 영문 이름 선정
//  : 입력 - input
//    출력 - output

public class Year {
    // 불기 연도 543 뺄셈하여 서기 연도 출력
    public int year_minus(int input) {
        int output_year = (input - 543);
        return output_year;
    }
    public static void main(String[] args){
        // 4. 테스트 케이스
        // 2541 --> 1998
        
        // 5. 프로그래밍 순서
        // 입력
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        // 처리
        Year main = new Year();
        int ouput = main.year_minus(input);

        // 출력
        System.out.println(ouput);
    }
}
