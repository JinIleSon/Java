package step10;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		int y = 1;
		int z = 1;
		while (x != 0 && y != 0 && z != 0) {
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
			
			if (x == 0 && y == 0 && z == 0)
				return ;
			if (Math.max(Math.max(x, y), Math.max(y, z)) == x) {
				if (x >= y+z) {
					System.out.println("Invalid");
					continue;
				}
			}else if (Math.max(Math.max(x, y), Math.max(y, z)) == y) {
				if (y >= x+z) {
					System.out.println("Invalid");
					continue;
				}
			}else if(Math.max(Math.max(x, y), Math.max(y, z)) == z) {
				if (z >= x+y) {
					System.out.println("Invalid");
					continue;
				}
			}
			
			if (x == y && y == z) {
				System.out.println("Equilateral");
				continue;
			}
			
			if (x == y || y == z || x == z) {
				System.out.println("Isosceles");
				continue;
			}
			
			System.out.println("Scalene");
		}
	}
}
