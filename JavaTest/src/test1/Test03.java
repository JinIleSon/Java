package test1;

/*
 * 날짜 : 2025/07/09
 * 이름 : 손진일
 * 내용 : 자바 기본 입출력 연습문제
 */

public class Test03 {
	public static void main(String[] args) {
		
		int result = 0;
		int num = 1;
		
		result = num++;
		System.out.println("result : "+result);
		
		result = ++num;
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);
	}
}
