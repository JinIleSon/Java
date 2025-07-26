package step8;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int B = sc.nextInt();
		
		f(N, B);
		
	}
	
	public static int f(int N, int B) {
		char c = 'A';
		int i = N%B;
		if (N < B) {
			if (N % B >= 10) {
				while (i - 10 > 0) {
					c++;
					i--;
				}
				System.out.print(c);
			}else {
				System.out.print(N % B);
			}
			return 0;
		}
		else {
			f(N/B, B);
			if (N % B >= 10) {
				while (i - 10 > 0) {
					c++;
					i--;
				}
				System.out.print(c);
			}else {
				System.out.print(N % B);
			}
			return 0;
		}
	}
}
