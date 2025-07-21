package step6;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] c;
		String s;
		int n = sc.nextInt();
		int index = 0;
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			s = sc.next();
			c = s.toCharArray();
			for (int j = 0; j < c.length; j++) {
				if (c[i] == c[j] && j < c.length - 1) {
					if (c[j] == c[j+1])
						index = j;
					
				}
				else if (c[i] == c[j] && j == c.length - 1 && c.length != 1)
					count++;
				else if (index == 0 && c.length > 2)
					index = i;
			}
			if (index == s.lastIndexOf(c[i]))
				count++;
		}
		System.out.println(count);
		
		sc.close();
		
/*		else if (j + 1 == c.length - 1)
			if (c[j + 1] == c[c.length - 1])
				index = j;*/
	}
}
