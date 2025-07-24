package step7;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A[][] = new int[9][9];
		int max = 0;
		int i_index = 0;
		int j_index = 0;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (max <= A[i][j]) {
					max = A[i][j];
					i_index = i + 1;
					j_index = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.print(i_index);
		System.out.print(" ");
		System.out.println(j_index);
		
	}
}
