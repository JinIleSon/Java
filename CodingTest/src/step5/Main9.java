package step5;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		x = ((x % 10) * 100) + ((x % 100) / 10) * 10 + (x / 100);
		y = ((y % 10) * 100) + ((y % 100) / 10) * 10 + (y / 100);
		
		if (x > y)
			System.out.println(x);
		else
			System.out.println(y);
	}
}
