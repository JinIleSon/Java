package step9;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int sum = 0;
		int j = 2;
		int count = 0;
		int min = 0;
		
		while (M <= N) {
			j = 2;
			while (j < M) {
				if (M % j == 0)
					break;
					j++;
			}
			if (j == M) {
				sum += M;
				count++;
			}
			if (j == M && count == 1)
				min = M;
			M++;
		}
		if (sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
