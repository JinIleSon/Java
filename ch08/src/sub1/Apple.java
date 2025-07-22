package sub1;

public class Apple {
	
	private String coutry;
	private int price;
	public Apple(String coutry, int price) {
		super(); // 상위 클래스는 오브젝트
		this.coutry = coutry;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Apple [coutry=" + coutry + ", price=" + price + "]";
	}
	
	
}
