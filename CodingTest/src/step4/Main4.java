package step4;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A[] = new int[9];
		
		for (int i = 0; i < 9; i++) {
			int num = sc.nextInt();
			A[i] = num;
		}
		int max_num = A[0];
		for (int i = 0; i < 9; i++) {
			if (max_num < A[i]) {
				max_num = A[i];
			}
		}
		System.out.println(max_num);
		for (int i = 0; i < 9; i++) {
			if (max_num == A[i]) {
				System.out.println(i+1);
			}
		}
		
	}
}
