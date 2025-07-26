package step7;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A[][] = new int[100][100];
		
		int N = sc.nextInt();
		int sum = 100*N;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int j = y; j < y + 10; j++) {
				for (int z = x; z < x + 10; z++) {
					A[j][z] += 1;
				}
			}
		}
		
		int x_length = 0;
		int y_length = 0;
		
		int i_dummy = 0;
		int j_dummy = 0;
		
		for (int i = 0; i < 100; i++) {
			x_length = 0;
			y_length = 0;
			for (int j = 0; j < 100; j++) {
				if (A[i][j] < 2)
					continue;
				i_dummy = i;
				j_dummy = j;
				while (A[i_dummy][j_dummy] >= 2) {
					if (i_dummy+1 != 100 && j_dummy+1 != 100 ) {
						if (A[i_dummy][j_dummy+1] < 2 || A[i_dummy+1][j_dummy] < 2) {
							break;
						}
					}
					x_length++;
					j_dummy++;
				}
				if(j_dummy >= 1)
					j_dummy--;
				while (A[i_dummy][j_dummy] >= 2) {
					if (i_dummy+1 != 100 && j_dummy+1 != 100 ) {
						if (A[i_dummy][j_dummy+1] < 2 || A[i_dummy+1][j_dummy] < 2) {
							break;
						}
					}
					y_length++;
					i_dummy++;
				}
				sum -= (x_length * y_length);
			}
		}
		System.out.println(sum);
	}
}
