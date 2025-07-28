package step4;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int temp = 0;
		int A[] = new int[N];
		
		for (int i = 0; i < N; i++) 
			A[i] = i+1;
		
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			
			
			int x = (b-a)/2;
			for (int j = 0; j <= x; j++) {
				temp = A[b];
				A[b] = A[a];
				A[a] = temp;
				a++;
				b--;
			}
				
			
			
		}
		
		for (int i = 0; i < N; i++)
			System.out.print(A[i] + " ");
	}
}
