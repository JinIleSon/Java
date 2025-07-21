package sub3;


/*
 * 날짜 : 2025/07/21
 * 이름 : 손진일
 * 내용 : 자바 StringBuilder 클래스 실습하기
 */

public class StringBuilderTest {
	public static void main(String[] args) {
		
		// String의 불변성(Immutable)
		String str = "Java";
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		str += "Programming";
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		System.out.println(str);
		
		// 빈번한 문자열 변경을 위한 StringBuilder(StringBuffer). Builder나 Buffer는 거의 동일하게 사용.
		StringBuffer sb = new StringBuffer("Java");
		System.out.println("sb 주소 : " + System.identityHashCode(str));
		
		sb.append("Programming"); // 처음 만들었던 문자열 객체 그대로 사용했음. 메모리 절약!
		System.out.println("sb 주소 : " + System.identityHashCode(str));
		
		System.out.println(sb);
	}
}
