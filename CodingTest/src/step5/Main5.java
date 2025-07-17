package step5;

import java.util.Scanner;

// charAt(인덱스): 해당 위치의 문자 출력

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int N = sc.nextInt();
		String A = sc.next();
		
		for (int i = 0; i < N; i++) {
			sum += (int)A.charAt(i)-48;
			
		}
		System.out.println(sum);
	}
}
