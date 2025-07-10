package step3;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		
		for (; N > 0; N--) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += (a * b);
		}
		if (X == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
