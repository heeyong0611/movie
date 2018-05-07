package kosta.ridonbox.model.dto;

public class BookDTO {
	private int cinemaNo;		//pk
	private String movieTitle;	//����
	private String auditorium;  //�¼�?
	private String date;		//������?
	private String ticketNum;	//���Ź�ȣ
	
	public BookDTO(int cinemaNo, String movieTitle, String auditorium, String date, String ticketNum) {
		this.cinemaNo = cinemaNo;
		this.movieTitle = movieTitle;
		this.auditorium = auditorium;
		this.date = date;
		this.ticketNum = ticketNum;
	}

	public int getCinemaNo() {
		return cinemaNo;
	}

	public void setCinemaNo(int cinemaNo) {
		this.cinemaNo = cinemaNo;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getAuditorium() {
		return auditorium;
	}

	public void setAuditorium(String auditorium) {
		this.auditorium = auditorium;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(String ticketNum) {
		this.ticketNum = ticketNum;
	}
}
