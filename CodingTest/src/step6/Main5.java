package step6;

import java.util.Arrays;
import java.util.Scanner;

// abcdefghijklmnopqrstuvwxyz
// a - 32 = A
// Arrays.stream(count).max().getAsInt()는 count 배열의 max(최대값)을 찾아준다. getAsInt()를 통해 정수를 가져온다. 없으면 스트림 객체라 오류발생가능

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char alphabet = 'a';
		char[] alpha = new char[26];
		int[] count = new int[26]; 
		int max_count = 0;
		int index = 0;
		char[] c = sc.next().toCharArray();
		
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = alphabet;
			count[i] = 0;
			alphabet++;
		}
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < alpha.length; j++) {
				if (c[i] == alpha[j] || c[i] == (alpha[j] - 32)) {
					count[j]++;
				}
			}
		}
		
		for (int i = 0; i < count.length; i++) {
			if (count[i] == Arrays.stream(count).max().getAsInt()) {
				index = i;
				max_count++;
			}
		}
		if (max_count != 1) {
			System.out.println("?");
		}else {
			System.out.println((char)(alpha[index] - 32));
		}
	}
}
