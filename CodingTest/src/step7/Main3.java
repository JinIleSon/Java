package step7;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char A[][] = new char[5][15];
		int max_length = 0;
		
		for (int i = 0; i < 5; i++) {
			char[] c = sc.next().toCharArray();
			if(max_length <= c.length)
				max_length = c.length;
			for (int j = 0; j < c.length; j++) {
				A[i][j] = c[j];
			}
		}
		for (int i = 0; i < max_length; i++) {
			for (int j = 0; j < 5; j++) {
				if (A[j][i] == '\u0000')
					continue;
				System.out.print(A[j][i]);
			}
		}
	}
}
