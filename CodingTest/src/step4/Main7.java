package step4;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A[] = new int[30];
		
		for (int i = 0; i < 30; i++) {
			A[i] = i+1;
		}
		for (int i = 0; i < 28; i++) {
			int num = sc.nextInt();
			for (int j = 0; j < 30; j++) {
				if (A[j] == num) {
					A[j] = 0;
				}
			}
		}
		int num = 0;
		int count = 0;
		for (int i = 0; i < 30; i++) {
			if (A[i] != 0) {
				if (count == 0) {
					num = A[i];
					count++;
				}else {
					if (num < A[i]) {
						System.out.println(num);
						System.out.println(A[i]);
					}else {
						System.out.println(A[i]);
						System.out.println(num);
					}
				}
				
			}
		}
	}
}
