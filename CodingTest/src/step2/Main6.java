package step2;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int A = sc.nextInt();
		
		int B = 0;
		
		M += A; // 분 전체를 더함
		B = M / 60; // 추가된 시간
		M %= 60; // 남은 분
		H += B; // 전체 시간을 더함
		H %= 24; // 다음날이 될
		
		System.out.printf("%d %d", H, M);
	}
}
