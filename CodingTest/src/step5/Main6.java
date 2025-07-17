package step5;

import java.util.Scanner;

// indexof(문자): 해당 문자의 위치 출력

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char alpha = 'a';
		
		String s = sc.next();
		for (int i = 0; i < s.length; i++) {
			while (alpha < 'z') {
				if (s.indexOf(alpha))
					alpha++;
			}
			
		}
	}
}
