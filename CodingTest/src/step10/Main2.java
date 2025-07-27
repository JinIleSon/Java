package step10;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		System.out.println(Math.min(Math.min(x, y), Math.min(w-x, h-y)));
		
		/*
		if (x < w-x && y < h-y) {
			if (x < y)
				System.out.println(x);
			else
				System.out.println(y);
		}else if (x > w-x && y > h-y) {
			if (x > y)
				System.out.println(w-x);
			else
				System.out.println(h-y);
		}else if (x < w-x && y > h-y) {
			if (x > h-y)
				System.out.println(h-y);
			else
				System.out.println(x);
		}else if (x > w-x && y < h-y){
			if (w-x > y)
				System.out.println(y);
			else
				System.out.println(w-x);
		}
		*/
	}
}
