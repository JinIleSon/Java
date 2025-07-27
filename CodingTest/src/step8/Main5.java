package step8;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 1;
		int N = sc.nextInt();
		int count = 1;
		int i = 1;
		
		while (sum < N) {
			
			sum += i * 6;
			count++;
			i++;
		}
		System.out.println(count);
	}
}
