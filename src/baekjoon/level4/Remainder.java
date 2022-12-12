package level4;
import java.util.Scanner;
// 백준 3052
// 1. 문제 파악
// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
// 그 다음 서로 다른 값이 몇 개 있는지 출력

// 2. 유추 파악
// 10개의 값을 입력받아 42로 나눈 나머지가 다른 개수가 몇 개인지 출력

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  나머지 - remainder
//  출력 - output

public class Remainder {
    public int compare(int input[], int remainder[]) {
        int count = 0;
        for(int j = 0; j < 10; j++){
            int compare = 0;
            for(int k = j+1; k < 10; k++){
                if(remainder[j] == remainder[k]){
                    // 중복되는 수 앞쪽에서 제거, 이후 나오는 중복되는 수 count++로 넘어가도록
                    compare++;
                }
            }
            if(compare==0){
                // 같은 수가 없을 때 count++
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // 1  -->  10
        // 2
        // 3
        // 4
        // 5
        // 6
        // 7
        // 8
        // 9
        // 10
        // 61

        // 42  -->  1
        // 84
        // 252
        // 420
        // 840
        // 126
        // 42
        // 84
        // 420
        // 126

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int input[] = new int[10];
        int remainder[] = new int[10];

        for(int i = 0; i < 10; i++){
            input[i] = scanner.nextInt();
            remainder[i] = input[i]%42;
        }

        // 처리
        Remainder main = new Remainder();
        int output = main.compare(input, remainder);

        // 출력
        System.out.println(output);
    }
}