package step6;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c = sc.next().toCharArray();
		int count = 0;
		
		for (int i = 0; i < c.length; i++) {
				if (i != c.length - 1) {
					if (c[i] == 'c' && (c[i+1] == '=' || c[i+1] == '-')) {
						count++;
						i++;
					}
					else if (c[i] == 'd') {
						if(c[i+1] == 'z') {
							if (i <= c.length - 2) {
								if (c[i+2] == '=') {
									count++;
									i+=2;
								}else {
									count+=2;
									i+=2;
								}
							}
						}else if(c[i+1] == '-') {
							count+=1;
							i++;
						}else {
							if (c.length == 2)
								count++;
							count++;
							i++;
						}
					}
					else if (c[i] == 'l' && c[i+1] == 'j') {
						count++;
						i++;
					}
					else if (c[i] == 'n' && c[i+1] == 'j') {
						count++;
						i++;
					}
					else if (c[i] == 's' && c[i+1] == '=') {
						count++;
						i++;
					}
					else if (c[i] == 'z' && c[i+1] == '=') {
						count++;
						i++;
					}else 
						count++;
			} else {
				count++;
			}
		}
		System.out.println(count);
	}
}
