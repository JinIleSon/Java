package step4;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int temp = 0;
		
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = i+1;
		}
		for (int z = 0; z < M; z++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			temp = A[i-1];
			A[i-1] = A[j-1];
			A[j-1] = temp;
		}
		for (int i = 0; i < N; i++) {
			System.out.print(A[i]+" ");
		}
	}
}
