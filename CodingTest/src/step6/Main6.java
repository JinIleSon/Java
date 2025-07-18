package step6;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c = sc.next().toCharArray();
		int count = 0;
		
		for (int i = 0; i < c.length; i++) {
				if (i != c.length - 1) {
					if (c[i] == 'c') {
						if (c[i+1] == '=' || c[i+1] == '-') {
							count++;
							i++;
						}
					}
					if (c[i] == 'd') {
						if (c[i+1] == 'z') {
							if (i != c.length - 2) {
								if (c[i+2] == '=') {
									count++;
									i+=2;
								}
							}
						}else if(c[i+1] == '-') {
							count++;
							i++;
						}
					}
					if (c[i] == 'l') {
						if (c[i+1] == 'j') {
							count++;
							i++;
						}
					}
					if (c[i] == 'n') {
						if (c[i+1] == 'j') {
							count++;
							i++;
						}
					}
					if (c[i] == 's') {
						if (c[i+1] == '=') {
							count++;
							i++;
						}
					}
					if (c[i] == 'z') {
						if (c[i+1] == '=') {
							count++;
							i++;
						}
					}
			} else {
				count++;
			}
		}
		System.out.println(count);
	}
}
