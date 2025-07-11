package step3;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 1; T > 0; T--, i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i, A, B, A+B);
		}
		
		sc.close();
	}
}
