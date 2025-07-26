package step8;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int C = 0;
		
		for (int i = 0; i < T; i++) {
			C = sc.nextInt();
			System.out.print(C / 25 + " ");
			C %= 25;
			if (C == 0) {
				System.out.println("0 0 0");
				continue;
			}
			if (C > 0) {
				System.out.print(C / 10 + " ");
				C %= 10;
				if (C == 0) {
					System.out.println("0 0");
					continue;
				}
				if (C > 0) {
					System.out.print(C / 5 + " ");
					C %= 5;
					if (C == 0) {
						System.out.println("0");
						continue;
					}
					if (C > 0) {
						System.out.println(C / 1);
					}
				}
			}
		}
	}
}
