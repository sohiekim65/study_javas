package baekjoon.level6;
import java.util.Scanner;
// 백준 10809
// 1. 문제 파악
// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 단어에 포함되어 있는 경우에는 
// 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력
// a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분

// 2. 유추 파악
// 입력받은 소문자의 처음 등장하는 위치를 숫자로 출력. 입력받은 단어의 알파벳이
// 존재하면 알파벳 순서에 맞게 0,1,2..로 출력. 입력받은 단어에서 존재하지 않는 알파벳이면
// 알파벳 순서의 공백만큼 -1 출력. ba 는 알파벳 순서에서 a가 0번째 --> a는 0 b는 1 e는 공백만큼 -1로 채운 뒤 b의 1 다음 숫자인 2 출력.
// bae --> 0(a) 1(b) -1(공백) -1(공백) 2(e)

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  알파벳 - alphabet
//  출력 - output

public class Alphabet {
    // 4. 테스트 케이스
    // baekjoon 
    // -->  1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1

    // 5. 입력
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); 
        int arr[] = new int[26]; 

        for(int i = 0; i < arr.length; i++){
            arr[i] = -1; // 알파벳들 -1로 초기화
        }

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            
            if(arr[ch - 'a'] == -1){
                arr[ch - 'a'] = i;
            }
        }

        for(int val : arr){
            System.out.print(val + " ");
        }
        scanner.close();
    }
}
