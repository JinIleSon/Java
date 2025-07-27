package step9;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;
		
		int i = 0;
		while (i <= N) {
			i++;
			if (N % i == 0)
				count++;
			if (K == count)
				break;
			if (i == N && K > count) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(i);
	}
}
