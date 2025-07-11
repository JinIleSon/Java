package step4;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A[] = new int[42];
		int count = 0;
		
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			A[num % 42] = 1;
		}
		for (int i = 0; i < 42; i++) {
			if (A[i] == 1)
				count++;
		}
		System.out.println(count);
	}
}
