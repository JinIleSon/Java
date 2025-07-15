package sub6;

/*
 * 날짜 : 2025/07/15
 * 이름 : 손진일
 * 내용 : 다형성 실습하기
 */

public class PolyTest {
	public static void main(String[] args) {
		
		// 다형성 실습
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		Shark shark = new Shark();
		
		tiger.move();
		eagle.move();
		shark.move();
	}
}
