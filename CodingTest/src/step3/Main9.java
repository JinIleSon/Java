package step3;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 1;
		
		for(int j = 1; j <= N; j++) {
			for(int i = 1; i <= count; i++) {
				System.out.print("*");
			}
			System.out.println();
			count++;
		}
	}
}
