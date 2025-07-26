package step8;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c = sc.next().toCharArray();
		int B = sc.nextInt();
		int B_next = 1;
		int num = 0;
		char alpha = 'A';
		long sum = 0;
		
		for (int i = c.length - 1; i >= 0; i--) {
			alpha = 'A';
			num = 0;
			while (c[i] >= 'A' && c[i] <= 'Z') {
				if (c[i] == alpha) {
					num+=10;
					break;
				}
				num++;
				alpha++;
			}
			if (c[i] >= '0' && c[i] <= '9') {
				num += (int)(c[i] - 48);
			}
			num *= B_next;
			B_next *= B;
			sum += num;
		}
		System.out.println(sum);
	}
}
