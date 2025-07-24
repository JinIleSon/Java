package step7;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int A[][] = new int[N][M];
		int B[][] = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int value = sc.nextInt();
				A[i][j] = value;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int value = sc.nextInt();
				B[i][j] = value;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] += B[i][j];
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
}
