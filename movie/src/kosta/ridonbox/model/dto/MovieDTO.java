package kosta.ridonbox.model.dto;

public class MovieDTO {
	private int movieNo;		//pk
	private String title;		//����
	private String titleEnglish;//��������
	private String director;	//����
	private String actor;		//���
	private String releasedate;	//������
	private String imgPath;			//�̹������
	private int grade;				//����
	
	public MovieDTO(int movieNo, String title, String titleEnglish, String director, String actor, String releasedate,
			String imgPath, int grade) {
		this.movieNo = movieNo;
		this.title = title;
		this.titleEnglish = titleEnglish;
		this.director = director;
		this.actor = actor;
		this.releasedate = releasedate;
		this.imgPath = imgPath;
		this.grade = grade;
	}

	public int getMovieNum() {
		return movieNo;
	}

	public void setMovieNum(int movieNo) {
		this.movieNo = movieNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleEnglish() {
		return titleEnglish;
	}

	public void setTitleEnglish(String titleEnglish) {
		this.titleEnglish = titleEnglish;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
