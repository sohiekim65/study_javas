// 문제
// (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
// 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
// refer : https://www.acmicpc.net/problem/10430
import java.util.Scanner;
public class RemainderAB {
    public static void main(String[] args){
    	// 입력
    	// 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
// 출력
// 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
        in.close();
    }
}