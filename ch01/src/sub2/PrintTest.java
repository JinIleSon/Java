package sub2;

/**
 * 날짜 : 2025/07/07
 * 이름 : 손진일
 * 내용 : Java 출력 실습 
 */

public class PrintTest {

	public static void main(String[] args) {
		
		// 기본 출력
		System.out.println("Hello Java!"); // 한 줄 복사 : Ctrl + Alt + 방향키 아래(위)
		System.out.println("Hello Korea!"); // 한 줄 삭제 : Ctrl + D
		System.out.println("Hello Busan!"); // 작업 취소 : Ctrl + Z
		
		// 한 줄 출력
		System.out.print("Welcome"); // ln(줄바꿈, 개행) 처리가 안 되기 때문에 그 다음 출력문이 바로 이어서 출력됨
		System.out.print("Java!");
		
		// 개행 출력
		//System.out.println(); // 줄바꿈
		System.out.print("Welcome\n"); // \n : 개행처리 이스케이프 특수문자
		System.out.print("Korea!"); // 줄바꿈
		
	}
}
