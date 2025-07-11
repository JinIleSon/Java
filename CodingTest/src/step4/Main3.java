package step4;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			A[i] = num;
		}
		int min_num = A[0];
		int max_num = A[0];
		for (int i = 1; i < N; i++) {
			if (min_num > A[i]) {
				min_num = A[i];
			}
		}
		System.out.print(min_num+" ");
		for (int i = 1; i < N; i++) {
			if (max_num < A[i]) {
				max_num = A[i];
			}
		}
		System.out.println(max_num);
		
	}
}
