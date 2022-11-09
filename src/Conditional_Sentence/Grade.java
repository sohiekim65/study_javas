package Conditional_Sentence;
import java.util.Scanner;
// 1. 문제 파악
//  : 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 
//    70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력
//    0 <= 시험 점수 <= 100

// 2. 유추 파악
//  : 90 ~ 100 -> A | 80 ~ 89 -> B | 70 ~ 79 -> C
//    60 ~ 69 -> D | 나머지 F 출력

// 3. 주요 단어 영문 이름 선정
//   : 입력 - input
//     정수 - demical
//     출력 - output

public class Grade {
    public String grade_A() {
        return "A";
    }
    public String grade_B() {
        return "B";
    }
    public String grade_C() {
        return "C";
    }
    public String grade_D() {
        return "D";
    }
    public String grade_F() {
        return "F";
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        //   100 --> A
        //   70 --> C

        // 5. 프로그래밍 순서
        //   입력
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        // 처리 
        Grade main = new Grade();
        String gradeA = main.grade_A();
        String gradeB = main.grade_B();
        String gradeC = main.grade_C();
        String gradeD = main.grade_D();
        String gradeF = main.grade_F();

        // 출력
        if(input >= 90) {
            System.out.println(gradeA);
        } else if( 80 <= input && input < 90) {
            System.out.println(gradeB);
        } else if( 70 <= input && input < 80) {
            System.out.println(gradeC);
        } else if( 60 <= input && input < 70) {
            System.out.println(gradeD);
        } else {
            System.out.println(gradeF);
        }
    }
}
