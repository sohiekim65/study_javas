package baekjoon.level6;
// 백준 2444
// 1. 문제 파악
// 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
// 목록에 있는 알파벳들은 하나의 알파벳으로 쓰이고, 없는 알파벳은 한 글자씩 센다.

import java.util.Scanner;

// 2. 유추 파악
// 입력받은 문자열에서 몇 개의 알파벳으로 이루어져 있는지 출력
// 목록에 있는 알파벳은 분리하지 않고 1개, 그 외는 한 글자씩 count

// 3. 주요 단어 영문 이름 선정
//  입력 - input
//  출력 - output
public class CroatiaAlphabet {
    public static void main(String[] args) {
        // 4. 테스트 케이스
        // ljes=njak --> 6
        // ddz=z= --> 3
        // nljj --> 3
        // c=c= --> 2
        // dz=ak --> 3
        
        // 5. 입력
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String str[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        scanner.close();

        for(int i = 0; i < str.length; i++){
            if(input.contains(str[i])){
                input = input.replace(str[i], "A");
            }
        }
        System.out.println(input.length());
    }
}
