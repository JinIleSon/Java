package step10;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if (x == y && y == z && x == z) {
			System.out.println(x+y+z);
			sc.close();
			return;
		}
		if (Math.max(Math.max(x, y), z) == x) {
			if (x < (y + z))
				System.out.println(x+y+z);
			else
				System.out.println(y+z+(y+z-1));
		}
		else if (Math.max(Math.max(x, y), z) == y) {
			if (y < (x + z))
				System.out.println(x+y+z);
			else
				System.out.println(x+z+(x+z-1));
		}
		else if (Math.max(Math.max(x, y), z) == z) {
			if (z < (x+y))
				System.out.println(x+y+z);
			else
				System.out.println(x+y+(x+y-1));
		}
		
		sc.close();
	}
}
