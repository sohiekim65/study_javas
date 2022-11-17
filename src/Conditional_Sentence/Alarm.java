package Conditional_Sentence;
import java.util.Scanner;
// 1. 문제 파악
//    원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것.
//    설정한 알람 시각이 주어졌을 때, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성
//    24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)   
//    (0 ≤ H ≤ 23, 0 ≤ M ≤ 59)

// 2. 유추 파악
//    두 정수를 입력받아 45분 앞서는 시간으로 바꾸기. 시간은 0~23 범위, 분은 0~59 범위다.

// 3. 주요 단어 영문 이름 선정
//    시간 - hour
//    분 - minute
//    정수 - demical
//    시각 - quadrant
//    출력 - output

public class Alarm {
    public int hour(int hour, int minute) {
        if(minute < 45){
            if(hour < 1) {
                hour = 23;
            } else {
                hour--;
            }
        } else {
            minute = minute - 45;
        }
        return hour;
    }
    public int minute(int hour, int minute) {
        if(minute < 45){
            if(hour < 1) {
                minute = (minute - 45) + 60;
            } else {
                minute = (minute - 45) + 60;
            }
        } else {
            minute = minute - 45;
        }
        return minute;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        //     10 10 -> 9 25
        //     0 30 -> 23 45
        //     23 40 -> 22 55
        //     2 57 -> 2 12

        // 5. 프로그래밍 순서
        //   입력
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt(); 
        int minute = scanner.nextInt(); 
        scanner.close();

        //  처리
        Alarm result = new Alarm();
        int output_hour = result.hour(hour, minute);
        int output_minute = result.minute(output_hour, minute);

        //  출력
        System.out.println(output_hour + " " + output_minute);
    }
}
