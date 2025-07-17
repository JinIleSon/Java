package test4.sub4;

public class Member {
	private String name;
	private String memberId;
	private Book borrowedBook;
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBook = null;
	}
	
	public void borrowBook(Book book) {
		this.borrowedBook = book;
		this.borrowedBook.borrowBook();
		
	}
	
	public void returnBook(Book book) {
		this.borrowedBook.returnBook();
		this.borrowedBook = null;
	}
	
	public void getMemberInfo() {
		System.out.println("회원명 : "+this.name);
		System.out.println("아이디 : "+this.memberId);
		if (this.borrowedBook == null)
			System.out.println("대출한 도서 : " + "없음");
		else
			System.out.println("대출한 도서 : "+borrowedBook.getTitle());
	}
	
}
