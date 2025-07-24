package sub1;

/*
 * 날짜 : 2025/07/24
 * 이름 : 손진일
 * 내용 : 자바 람다식 실습하기
 */
@FunctionalInterface
interface A {
	public int method(int a, int b);
}

public class LambdaTest {
	
	public static void main(String[] args) {
		
		// 람다식 정의
		A a1 = (int a, int b) -> {
			int c = a + b;
			return c;
		};
		
		A a2 = (a, b) -> {
			return a + b;
		};
		
		A a3 = (a, b) -> a + b; // {중괄호} 생략은 return
		
		int r1 = a1.method(1, 2);
		int r2 = a1.method(2, 3);
		int r3 = a1.method(3, 4);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
	}
}
