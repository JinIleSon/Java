package test4.sub4;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false;
	}
	
	public void borrowBook() {
		if (isBorrowd == false) {
			this.isBorrowd = true;
			System.out.println("도서대출 : "+this.title);
		}else {
			System.out.println(this.title+" 이미 대출됨");
		}
	}
	
	public void returnBook() {
		if (isBorrowd == true) {
			this.isBorrowd = false;
			System.out.println("도서반납 : "+this.title);
		}
	}
	
	public void getBookInfo() {
		System.out.println("도서명 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("ISBN : " + isbn);
		if (isBorrowd == false) 
			System.out.println("대출여부 : " + "가능");
		else
			System.out.println("대출여부 : 불가능");
	}
	
	public String getTitle() {
		return this.title;
	}
}
