package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double A[] = new double[N];
		
		for (int i = 0; i < N; i++) {
			int score = sc.nextInt();
			A[i] = score;
		}
		
		double max = Arrays.stream(A).max().getAsDouble();
		double sum = 0;
		
		for (int i = 0; i < N; i++) {
			A[i] = (A[i]/max)*100;
			sum += A[i];
		}
		System.out.println(sum / N);
	}
}
