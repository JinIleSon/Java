package step10;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			a[i] = x;
			b[i] = y;
		}
		
		int x = Arrays.stream(a).max().getAsInt() - Arrays.stream(a).min().getAsInt();
		int y = Arrays.stream(b).max().getAsInt() - Arrays.stream(b).min().getAsInt();
		
		System.out.println(x*y);
	}
}
