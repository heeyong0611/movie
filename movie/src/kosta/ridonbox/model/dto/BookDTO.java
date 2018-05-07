package kosta.ridonbox.model.dto;

public class BookDTO {
	private String bookNo;			//���Ź�ȣ.
	private String memberId;		//ȸ�����̵�
	private String movieNo;		//��ȭ��ȣ
	private String AuditoriumNo;	//�󿵰��̸�.
	private String screenNo;  //�󿵱���ȣ.		
	private String ticketNum;	//���Ź�ȣ
	
	public BookDTO(String bookNo, String memberId, String movieNo, String auditoriumNo, String screenNo,
			String ticketNum) {
		this.bookNo = bookNo;
		this.memberId = memberId;
		this.movieNo = movieNo;
		AuditoriumNo = auditoriumNo;
		this.screenNo = screenNo;
		this.ticketNum = ticketNum;
	}

	public String getBookNo() {
		return bookNo;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMovieNo() {
		return movieNo;
	}

	public void setMovieNo(String movieNo) {
		this.movieNo = movieNo;
	}

	public String getAuditoriumNo() {
		return AuditoriumNo;
	}

	public void setAuditoriumNo(String auditoriumNo) {
		AuditoriumNo = auditoriumNo;
	}

	public String getScreenNo() {
		return screenNo;
	}

	public void setScreenNo(String screenNo) {
		this.screenNo = screenNo;
	}

	public String getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(String ticketNum) {
		this.ticketNum = ticketNum;
	}
	
}
