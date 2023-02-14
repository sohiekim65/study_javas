package baekjoon.level6;
import java.util.Scanner;
// 백준 1157
// 1. 문제 파악
// 단어가 주어지면, 단어에서 가장 많이 사용된 알파벳을 대문자로 출력(대소문자 구분x).
// 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우 ? 출력.

// 2. 유추 파악
// 입력한 단어에 가장 개수가 많은 알파벳 출력하되 개수가 동일한 알파벳이
// 여러 개 존재하면 ?로 출력.

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  알파벳 - alphabet
//  출력 - output

public class ManyUseAlphabet {
    public char manyUseAlphabet(String input, int[] arr) {
        for(int i = 0; i < input.length(); i++) {   // 입력받은 문자열 알파벳 비교 반복문

            if(65 <= input.charAt(i) && input.charAt(i) <= 90) {    // 대문자 범위
                arr[input.charAt(i) - 65]++;    // arr[]배열에 넣어주고 같은 인덱스면 ++(배열의 인덱스를 위해 각 알파벳의 십진수 빼주기)
            }
            else {  // 소문자(소문자 : 97~122)
                arr[input.charAt(i) - 97]++; 
            }
        }

        int max = 0; // 최대값 비교를 위해
        char output = '?'; 

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {  
                max = arr[i];   // 여기서 max값 대입해서 올려주기
                output = (char)(i + 65);  // 대문자 출력을 위해, char로 cast도 해주기
            }
            else if (arr[i] == max) {   // 최대값이 여러개면 ? 출력
                output = '?';
            }
        }
        return output;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // Mississipi --> ?
        // zZa --> Z
        // z --> Z
        // baaa --> A

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[26];    // 알파벳 개수 26개

        String input = scanner.next();
        scanner.close();

        // 처리
        ManyUseAlphabet main = new ManyUseAlphabet();
        char result = main.manyUseAlphabet(input, arr);

        // 출력
        System.out.println(result);
    }
}
