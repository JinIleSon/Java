package step6;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] c;
		char[] dummy_array = new char[100];
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			c = sc.next().toCharArray();
			for(int j = 0; j < c.length; j++) {
				if (dummy_array[i] == '\u0000')
					dummy_array[i] = c[i];
				for (int z = 0; z < c.length; z++) {
					if (dummy_array[z] == c[i] && count >= 2)
						
				}
			}
		}
	}
}
