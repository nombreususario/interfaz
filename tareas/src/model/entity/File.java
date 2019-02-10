package model.entity;

public class File {
	private String text;
	private int number;
	public File() {
		
	}
	public File(String text) {
		this.text=text;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Object[] fileToObject() {
		Object[] obj=new Object[1];
		obj[0]=text;
		return obj;
	}
}
