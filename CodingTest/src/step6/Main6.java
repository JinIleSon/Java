package step6;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c = sc.next().toCharArray();
		int count = 0;
		
		for (int i = 0; i < c.length; i++) {
				if (i != c.length - 1) {
					if (c[i] == 'c' && (c[i+1] == '=' || c[i+1] == '-')) 
						i++;
					else if (c[i] == 'd' && c[i+1] != 'd') {
						if(c[i+1] == 'z') {
							if (i <= c.length - 3) {
								if (c[i+2] == '=')
									i+=2;
							}else {
								if (i < 2 && c.length <= 2) {
									count+=2;
									break;
								}
							}
						}else if(c[i+1] == '-')
							i++;
						else 
							i++;
					}
					else if (c[i] == 'l' && c[i+1] == 'j')
						i++;
					else if (c[i] == 'n' && c[i+1] == 'j')
						i++;
					else if (c[i] == 's' && c[i+1] == '=') 
						i++;
					else if (c[i] == 'z' && c[i+1] == '=')
						i++;
					count++;
			} else {
				count++;
			}
		}
		System.out.println(count);
	}
}
