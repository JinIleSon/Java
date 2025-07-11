package step3;

import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 1;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N-count; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= count; j++) {
				System.out.print("*");
			}
			count++;
			System.out.println();
		}
	}
}
