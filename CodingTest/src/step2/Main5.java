package step2;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int minus = 0;
		
		if (M < 45) {
			H--;
			if (H < 0) 
				H = 23;
			minus = M - 45;
			M = 60 + minus;
		}else {
			M -= 45;
		}
		
		System.out.printf("%d %d", H, M);
	}
}

