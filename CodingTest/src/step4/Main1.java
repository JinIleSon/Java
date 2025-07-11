package step4;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int N = sc.nextInt();
		int N_dummy = N;
		int num[] = new int[N];
		
		for (int i = 0; N > 0; N--, i++) {
			num[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		for (int i = 0; N_dummy > 0; N_dummy--, i++) {
			if (v == num[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
