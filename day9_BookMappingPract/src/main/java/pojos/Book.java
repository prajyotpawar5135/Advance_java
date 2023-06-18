package pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Books")
public class Book extends BaseEntity{

	@Column(name="Book_title",length=30)
	private String title;
	
	private double price;
	
	@ManyToOne
	@JoinColumn(name="author_id")
	private Author authorid;

	
	

	public Book() {
		super();
	}


	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
		//this.authorid = authorid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Author getAuthorid() {
		return authorid;
	}


	public void setAuthorid(Author authorid) {
		this.authorid = authorid;
	}


	@Override
	public String toString() {
		return "bookid"+getId()+"Book [title=" + title + ", price=" + price + ", authorid=" + authorid + "]";
	}
	
	
	
}
