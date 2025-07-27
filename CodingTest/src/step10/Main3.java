package step10;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x[] = new int[2];
		int y[] = new int[2];
		
		for (int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			
			for (int j = 0; j < 2; j++) {
				if (x[j] == 0) {
					x[j] = a;
					break;
				}
				else if (x[j] == a) {
					x[j] = 0;
					break;
				}
			}
			int b = sc.nextInt();
			for (int j = 0; j < 2; j++) {
				if (y[j] == 0) {
					y[j] = b;
					break;
				}
				else if (y[j] == b) {
					y[j] = 0;
					break;
				}
			}
		}
		for(int z = 0; z < 2; z++) {
			if (x[z] != 0) {
				System.out.print(x[z]+ " ");
				break;
			}
		}
		for (int z = 0; z < 2; z++) {
			if (y[z] != 0) {
				System.out.println(y[z]);
				break;
			}
		}
		
	}
}
