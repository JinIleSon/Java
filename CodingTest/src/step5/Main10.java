package step5;

import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char c[] = sc.next().toCharArray();
		int sum = 0;
		
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'A' || c[i] == 'B' || c[i] == 'C')
				sum += 3;
			else if (c[i] == 'D' || c[i] == 'E' || c[i] == 'F')
				sum += 4;
			else if (c[i] == 'G' || c[i] == 'H' || c[i] == 'I')
				sum += 5;
			else if (c[i] == 'J' || c[i] == 'K' || c[i] == 'L')
				sum += 6;
			else if (c[i] == 'M' || c[i] == 'N' || c[i] == 'O')
				sum += 7;
			else if (c[i] == 'P' || c[i] == 'Q' || c[i] == 'R' || c[i] == 'S')
				sum += 8;
			else if (c[i] == 'T' || c[i] == 'V' || c[i] == 'U')
				sum += 9;
			else if (c[i] == 'W' || c[i] == 'X' || c[i] == 'Y' || c[i] == 'Z')
				sum += 10;
		}
		System.out.println(sum);
	}
}
