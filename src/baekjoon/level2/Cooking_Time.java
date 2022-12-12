package level2;
import java.util.Scanner;
// 1. 문제 파악
//    훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 
//    분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성
//    현재 시각 (0 ≤ A ≤ 23), 분(0 ≤ B ≤ 59),
//    요리하는데 필요한 시간 (0 ≤ C ≤ 1,000)

import javax.naming.spi.DirStateFactory.Result;

// 2. 유추 파악
//    현재 시간의 시 (A)와 분(B), 요리하는 시간(C)를 입력받아 요리가 끝나는 시간을 출력

// 3. 주요 단어 영문 이름 선정
//    현재 시간 시 - A
//    현새 시간 분 - B
//    요리 시간 - C
//    출력 - output

public class Cooking_Time {
    public int hour(int A, int B, int C, int BC) {
        if((BC) >= 60){
            A = (A + ((BC)/60));
            if(A >= 24) {
                A = (A - 24);
            }
        }
        return A;
    }

    public int minute(int A, int B, int C, int BC) {
        if((B+C) >= 60){
            if(A >= 24) {
                B = ((BC)%60);
            } else {
                B = ((BC)%60);
            }
        }
        return B;
    }
   
    public static void main(String[] args) {
        // 4. 테스트 케이스
        //     14 30 20 --> 14 50
        //     17 40 80 --> 19 0
        //     23 48 25 --> 0 13

        // 5. 프로그래밍 순서
        //     입력
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int BC = B + C;
        scanner.close();

        //  처리 
        Cooking_Time main = new Cooking_Time();
        int output_hour = main.hour(A, B, C, BC);
        int output_minute = main.minute(A, B, C, BC);

        // 출력
        if((B+C) >= 60){
            System.out.println(output_hour + " " + output_minute);
        }else {
            System.out.println(output_hour + " " + (output_minute+C));
        }
    }
}
