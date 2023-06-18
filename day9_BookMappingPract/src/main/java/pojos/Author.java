package pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Authors")
public class Author extends BaseEntity {

	@Column(name = "fname", length = 30)
	private String firstName;

	@Column(name = "lname", length = 30)
	private String lastName;

	@Column(name = "email", length = 30, unique = true)
	private String email;

	private String password;
	@OneToMany(mappedBy = "authorid", cascade = CascadeType.ALL)
	List<Book> books = new ArrayList<>();

	public Author() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Author(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Authorid" + getId() + "Author [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + "]";
	}

	public void addBookToList(Book book) {
		books.add(book);
		book.setAuthorid(this);
	}

	

}
