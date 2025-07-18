package step6;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c = sc.next().toCharArray();
		
		for (int i = 0; i < (c.length / 2); i++) {
			if (c[i] != c[c.length - 1 - i]) {
				System.out.println(0);
				return ;
			}
		}
		
		System.out.println(1);
	}
}
