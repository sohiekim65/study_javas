package codingTest;

import java.util.Scanner;

public class ReturnNum {
    // 확인용
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     String input = scanner.next();
    //     int answer = 0;
    //     String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    //     for(int i = 0; i < 10; i++) {
    //         input = input.replace(num[i], Integer.toString(i));
    //     }
    //     answer=Integer.parseInt(input);
    //     System.out.println(answer);
    // }

    public int solution(String s) {
        int answer = 0;
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < 10; i++) {
            s = s.replace(num[i], Integer.toString(i));
        }
        answer=Integer.parseInt(s);
        return answer;
    }
}
