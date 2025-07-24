package step6;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double dg_sum = 0.0;
		double d_sum = 0.0;
		double grade_num = 0.0;
		
		for (int i = 0; i < 20; i++) {
			String s = sc.next();
			Double d = sc.nextDouble();
			char[] grade = sc.next().toCharArray();
			
			if (grade[0] == 'P')
				continue;
			if (grade[0] == 'A') {
				if(grade[1] == '+')
					grade_num = 4.5;
				else
					grade_num = 4.0;
			}else if(grade[0] == 'B') {
				if(grade[1] == '+')
					grade_num = 3.5;
				else
					grade_num = 3.0;
			}else if(grade[0] == 'C') {
				if(grade[1] == '+')
					grade_num = 2.5;
				else
					grade_num = 2.0;
			}else if(grade[0] == 'D') {
				if(grade[1] == '+')
					grade_num = 1.5;
				else
					grade_num = 1.0;
			}else if(grade[0] == 'F')
				grade_num = 0.0;
			
			dg_sum = dg_sum + (d * grade_num);
			d_sum += d;
		}
		System.out.printf("%.6f", dg_sum / d_sum);
		
	}
}
