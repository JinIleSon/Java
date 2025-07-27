package step9;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int i = 1;
		int sum = 0;
		
		while (n != -1) {
			n = sc.nextInt();
			if (n == -1)
				return ;
			i = 1;
			sum = 0;
			for (; i < n; i++) {
				if (n % i == 0) {
					sum += i;
				}
			}
			if (sum == n) {
				i = 1;
				System.out.print(n+" = ");
				for (; i < n; i++) {
					if (n % i == 0 && n / 2 > i) {
						System.out.print(i+" + ");
					}else if (n / 2 == i)
						System.out.println(i);
				}
			}else {
				System.out.println(n+" is NOT perfect.");
			}
		}	
	}
	//System.out.print(n+" = ");
	//System.out.print(i+" + ");
}
