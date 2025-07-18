package step6;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int king = 1;
//		int queen = 1;
//		int look = 2;
//		int bishop = 2;
//		int knight = 2;
//		int pawn = 8;
		
		int chess[] = { 1, 1, 2, 2, 2, 8 };
		int x = 0;
		int res = 0;
		
		for (int i = 0; i < 6; i++) {
			x = sc.nextInt();
			res = chess[i] - x;
			System.out.print(res + " ");
		}
	}
}
