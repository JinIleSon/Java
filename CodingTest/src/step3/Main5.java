package step3;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		N /= 4;
		for (; N > 0; N--) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
}
