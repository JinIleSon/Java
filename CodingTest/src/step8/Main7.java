package step8;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double V = sc.nextDouble();
		
		
		
		
		//A - B >= V
		
	//	while (sum < V) {
		//	sum += A;
			//count++;
			//if (sum >= V)
			//	break;
			//sum -= B;
	//	}
		System.out.println((int)Math.ceil((V-B)/(A-B)));
	}
}
