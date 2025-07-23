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
		int word_count = 0;
		
		for (int i = 0; i < n; i++) {
			s = sc.next();
			c = s.toCharArray();
			word_count=0;
			for (int z = 0; z < c.length; z++) {
				index = z;
				for (int j = 0; j < c.length; j++) {
					if (c[z] == c[j] && j < c.length - 1) {
						if (c[j] == c[j+1])
							index = j+1;
					}	
				}
				if (index != s.lastIndexOf(c[z])) {
					word_count++;
					break;
				}
				// babb와 같이 두번째 b가 순서일 때 생각하기
			}
			if (word_count == 0)
				count++;
		}
		System.out.println(count);
		
		sc.close();
		
/*		else if (j + 1 == c.length - 1)
			if (c[j + 1] == c[c.length - 1])
				index = j;*/
	}
}
