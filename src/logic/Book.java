package logic;

public class Book {
	private String publisher;
	private int year;
	private String isbnID;
	private String author;
	private String title;
	private double cost;
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getIsbnID() {
		return isbnID;
	}
	public void setIsbnID(String isbnID) {
		this.isbnID = isbnID;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Book [publisher=" + publisher + ", year=" + year + ", isbnID=" + isbnID + ", author=" + author
				+ ", title=" + title + ", cost=" + cost + "]";
	}
	
	public Book(String publisher, int year, String isbnID, String author, String title, double cost) {
		super();
		this.publisher = publisher;
		this.year = year;
		this.isbnID = isbnID;
		this.author = author;
		this.title = title;
		this.cost = cost;
	}
	
	
	
	
	
}
