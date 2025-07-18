package step5;

import java.util.Scanner;

// Java에서는 문자열의 끝을 배열.length로 하기

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c = sc.nextLine().toCharArray();
		int count = 0;
		
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ')
				count++;
		}
		if (c[0] == ' ' && c[c.length - 1] == ' ')
			System.out.println(--count);
		else if (c[c.length - 1] == ' ')
			System.out.println(count);
		else if (c[0] == ' ')
			System.out.println(count);
		else
			System.out.println(++count);
	}
}
