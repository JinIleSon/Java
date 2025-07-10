package step2;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;
		
		if (a == b && b == c) {
			System.out.println(10000 + a * 1000);
			return ;
		}
		if (a == c) {
			if (a != b) {
				System.out.println(1000+a*100);
				return;
			}
		}
		if (a == b) {
			if (b != c) {
				System.out.println(1000 + a * 100);
				return ;
			}
		}else {
			if (b == c) {
				System.out.println(1000 + b * 100);
				return ;
			}else {
				System.out.println(Math.max(Math.max(a,b), c) * 100);
				return ;
			}
		}
	}
}
