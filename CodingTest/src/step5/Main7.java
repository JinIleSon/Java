package step5;

import java.util.Scanner;

// Character.toString(문자) : 문자열로 바꿈. / repeat(정수) : 정수만큼 반복

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int R = 0;
		char[] c;
		
		for (int i = 0; i < T; i++) {
			R = sc.nextInt();
			c = sc.next().toCharArray();
			
			for (int j = 0; j < c.length; j++) {
				System.out.print(Character.toString(c[j]).repeat(R));
			}
			System.out.println();
		}
	}
}
