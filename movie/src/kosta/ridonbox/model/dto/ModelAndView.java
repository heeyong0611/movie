package kosta.ridonbox.model.dto;

public class ModelAndView {
	private String path;
	private boolean isRedirect;//true이면 redirect방식 ,false이면 forward방식
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	
	
	
}
