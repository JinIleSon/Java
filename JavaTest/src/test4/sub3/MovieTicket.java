package test4.sub3;

public class MovieTicket {
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;
	}
	
	public void bookTicket() {
		if (this.isBooked == false) {
			this.isBooked = true;
			System.out.printf("%s, %s, %s 예매 완료\n", movieTitle, screenTime, seatNumber);
		}else {
			System.out.println("이미 예매됨");
		}
	}
		
	public void cancelBook() {
		if (this.isBooked == true) {
			this.isBooked = false;
			System.out.printf("%s, %s, %s 취소 완료\n", movieTitle, screenTime, seatNumber);
		}else {
			System.out.println("아직 예매 안됨");
		}
	}
	
	public void printTicketInfo() {
		System.out.println("영화제목 : " + this.movieTitle);
		System.out.println("상영시간 : " + this.screenTime);
		System.out.println("좌석번호 : " + this.seatNumber);
		if (this.isBooked == true)
			System.out.println("예매여부 : Yes");
		else
			System.out.println("예매여부 : No");
	}

}
