package baekjoon.level6;
import java.util.Scanner;
// 백준 1152
// 1. 문제 파악
// 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 
// 이 문자열에 단어의 개수 출력.

// 2. 유추 파악
// 입력한 단어에 가장 개수가 많은 알파벳 출력하되 개수가 동일한 알파벳이
// 여러 개 존재하면 ?로 출력.

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  출력 - output

public class NumberOfWords {
    public int count(String input) {
        String[] word = input.split(" ");   // 공백으로 나누니 배열로 받기
        int result = 0;

        // 아무것도 입력해주지 않았을 때 처리도 해줘야 함.(runtime error)
        if(word.length == 0) { 
            result = 0;
        } else if(word[0] == ""){
            result = word.length -1;
        } else {
            result = word.length;
        }
        return result;
    }
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // The Curious Case of Benjamin Button --> 6
        // The first character is a blank --> 6
        // The last character is a blank  --> 6

        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] word = input.split(" ");   // 공백으로 나누니 배열로 받기

        // 처리
        NumberOfWords main = new NumberOfWords();
        int output = main.count(input);
        System.out.println(output);
    }
}
