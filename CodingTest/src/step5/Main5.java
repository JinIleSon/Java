package step5;

import java.util.Scanner;

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
