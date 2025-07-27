package step8;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int count = 0;
		int i = 1;
		
		while (count < X) {
			count += i;
			
			if (count >= X)
				break;
			i++;
		}
		int j = 1;
		while (j < i) {
			j++;
		}
		j = X - j;
		
		int z = 1;
		while(z < i-1) {
			j -= z;
			z++;
		}
		
		
		if (i % 2 == 0) {
			int numerator = 1;
			int denominator = i;
			while (j > 0) {
				numerator++;
				denominator--;
				j--;
			}
			System.out.println(numerator+"/"+denominator);
		}else {
			int numerator = i;
			int denominator = 1;
			while (j > 0) {
				numerator--;
				denominator++;
				j--;
			}
			System.out.println(numerator+"/"+denominator);
		}
		
	}
}
