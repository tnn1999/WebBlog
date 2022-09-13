package model;

import java.sql.Date;
import java.sql.Timestamp;

public class NewsModel {

	private Long id;
	
    private String title,thumbnail,shortdescription,content,author;
    private int status;
    private Timestamp createdAt;
    
    
    
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public NewsModel() {
		super();
	}
	public NewsModel(Long id, String title, String thumbnail, String shortdescription, String content, String author,
			int status) {
		super();
		this.id = id;
		this.title = title;
		this.thumbnail = thumbnail;
		this.shortdescription = shortdescription;
		this.content = content;
		this.author = author;
		this.status = status;
	}
	public NewsModel(Long id, String title, String shortdescription, String content, String author, int status) {
		super();
		this.id = id;
		this.title = title;
		this.shortdescription = shortdescription;
		this.content = content;
		this.author = author;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getShortdescription() {
		return shortdescription;
	}
	public void setShortdescription(String shortdescription) {
		this.shortdescription = shortdescription;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "NewsModel [id=" + id + ", title=" + title + ", thumbnail=" + thumbnail + ", shortdescription="
				+ shortdescription + ", content=" + content + ", author=" + author + ", status=" + status
				+ ", createdAt=" + createdAt + "]";
	}
	
    

}
