package baekjoon.level4;
import java.util.Scanner;
// 백준 1546
// 1. 문제 파악
// 과목 점수 중 최댓값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고친 평균 구하기
// 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 
// 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답

// 2. 유추 파악
// 첫째 줄에 과목의 개수 N이 주어지고 둘째 줄에 과목 점수가 주어진다.
// 점수/최대값*100 으로 새로운 평균 구하기

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  최대값 - max
//  출력 - output

public class Average {
    public double averge(Scanner scanner, double subject[]) {
        double max = 0;
        for(int i = 0; i < subject.length; i++){
            subject[i] = scanner.nextDouble();
            if(max < subject[i]){
                max = subject[i];
            }
        }

        double output = 0;
        for(int i = 0; i < subject.length; i++){
            output += (subject[i]/max)*100;
        }
        return output;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 3
        // 40 80 60  --> 75.0
        // 3
        // 10 20 30  --> 66.666667
        // 4
        // 1 100 100 100 --> 75.25

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double subject[] = new double[count];

        // 처리
        Average main = new Average();
        double result = main.averge(scanner, subject);

        // 출력
        System.out.println(result/count);
        scanner.close();
    }
}
