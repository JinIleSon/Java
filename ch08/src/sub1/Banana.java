package sub1;

public class Banana {
	
	private String coutry;
	private int price;
	public Banana(String coutry, int price) {
		super(); // 상위 클래스는 오브젝트
		this.coutry = coutry;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Banana [coutry=" + coutry + ", price=" + price + "]";
	}
	
	
}
