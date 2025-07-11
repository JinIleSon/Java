package step4;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int A[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			A[i] = num;
			if (A[i] < X) {
				System.out.printf("%d ", A[i]);
			}
		}
	}
}
