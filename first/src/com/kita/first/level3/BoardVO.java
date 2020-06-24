package com.kita.first.level3;

public class BoardVO {
	private String title;
	private String content;
	private int writeId;
	
	public BoardVO() {
		super();
	}
	
	public BoardVO(String title, String content, int writeId) {
		super();
		setTitle(title);
		setContent(content);
		setWriteId(writeId);
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	
	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}
	public int getWriteId() {
		return writeId;
	}
	
}
