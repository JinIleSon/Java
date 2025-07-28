package step7;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A[][] = new int[100][100];
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int j = y; j < y+10; j++) {
				for (int z = x; z < x+10; z++) {
					A[j][z] = 1;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (A[i][j] == 1)
					sum += 1;
			}
		}
		System.out.println(sum);
	}
}
