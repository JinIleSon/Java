package step5;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] S = sc.nextLine().split("");
		int i = sc.nextInt();
		
		System.out.println(S[i-1]);
	}
}
