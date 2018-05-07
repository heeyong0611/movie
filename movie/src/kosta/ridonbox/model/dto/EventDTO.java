package kosta.ridonbox.model.dto;

public class EventDTO {
	private int eventNo;	  //pk 
	private String eventTitle;//����
	private String date;	  //��¥
	private String movieTitle;//��ȭ����
	private String context;	  //����
	
	
	public EventDTO(int eventNo, String eventTitle, String date, String movieTitle, String context) {
		this.eventNo = eventNo;
		this.eventTitle = eventTitle;
		this.date = date;
		this.movieTitle = movieTitle;
		this.context = context;
	}
	
	public int getEventNo() {
		return eventNo;
	}

	public void setEventNo(int eventNo) {
		this.eventNo = eventNo;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
	
}
