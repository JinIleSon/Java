package step4;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A[] = new int[N];
		
		int M = sc.nextInt();
		for (; M > 0; M--) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			int k = sc.nextInt();
			
			for (; i <= j; i++) {
				A[i] = k;
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(A[i]+ " ");
		}
	}
}
