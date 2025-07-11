package step5;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (; T > 0; T--) {
			String[] S = sc.next().split("");
			System.out.println(S[0]+S[S.length - 1]);
		}
	}
}
