package step6;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int N_dummy = N;
		
		int i = 0;
		for (; i < N; i++) {
			for (int j = 0; j < N - i - 1; j++) {
				System.out.print(" ");
			}
			for (int z = 0; z < 2 * i + 1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		i -= 2;
		for (int z = 0; z < N - 1; z++) {
			for (int a = 0; a < z+1; a++) {
				System.out.print(" ");
			}
			for (int h = 0; h < 2 * i + 1; h++) {
				System.out.print("*");
			}
			i--;
			System.out.println();
		}
	}
}
