package step5;

import java.util.Scanner;

// hasNext()로 입력의 끝을 지정. EOF(데이터를 읽을 게 없다는 의미)

public class Main11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = "";
		while (sc.hasNext()) {
			s = sc.nextLine();
			System.out.println(s);
		}
	}
}
