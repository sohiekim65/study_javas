package level3;
import java.util.Scanner;
// 백준 2439
// 1. 문제 파악
// 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
// 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 또 더하여 결과값 출력
// 2+6=8, 6+8=14, 8+4=12, 4+2=6 --> N의 사이클 길이 = 4
// N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성

// 2. 유추 파악
// 주어진 숫자가 10미만이면 0을 붙여 두 자리 수로 만들고 두자리 숫자가 주어지면
// 앞자리와 뒷자리를 더해 연산 후 뒷자리와 연산 결과값의 뒷자리를 더하기 반복
// 처음 연산 숫자가 나올 때 까지 반복하여 그 count 출력

// 3. 주요 단어 영문 이름 선정
//    입력 - input
//    사이클 - cycle
//    출력 - output

public class Cycle {
    public int count(int input, int cycle) {
        int i = 0;
        while(true){
            i++;
            int first = cycle/10;
            int second = cycle%10;
            cycle = (second*10 + (first+second)%10); 
            
            if(input == cycle){
                break;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 26 --> 4
        // 55 --> 3
        // 1 --> 60
        // 0 --> 1
        // 71 --> 12

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int cycle = input;
        scanner.close();
        
        // 처리
        Cycle main = new Cycle();
        int output = main.count(input, cycle);

        // 출력
        System.out.println(output);
    }
}
