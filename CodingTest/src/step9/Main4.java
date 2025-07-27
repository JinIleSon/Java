package step9;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int j = 2;
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			j = 2;
			for (; j < num; j++) {
				if (num % j == 0)
					break;
			}
			if (j == num)
				count++;
			
		}
		System.out.println(count);
	}
}
