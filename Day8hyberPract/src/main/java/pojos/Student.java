package pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stud_id")
	private Integer Student_id;
	@Column(name="first_name" ,length=30)
	private String firstName;
	@Column(name="last_name" ,length=30)
	private String lastName;
	@Column(length = 20, unique = true)
	private String email;
	@Column(length = 30, nullable = false)
	private String password;
	@Enumerated(EnumType.STRING)
	private CourseType courses;
	@Column(nullable=false)
	private LocalDate dob;

	public Student(String firstName, String lastName, String email, String password, CourseType courses,
			LocalDate dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.courses = courses;
		this.dob = dob;
	}

	public Student(Integer student_id, CourseType courses) {
		super();
		Student_id = student_id;
		this.courses = courses;
	}

	public Student() {
		
	}

	public Integer getStudent_id() {
		return Student_id;
	}

	public void setStudent_id(Integer student_id) {
		Student_id = student_id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CourseType getCourses() {
		return courses;
	}

	public void setCourses(CourseType courses) {
		this.courses = courses;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [Student_id=" + Student_id + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", password=" + password + ", courses=" + courses + ", dob=" + dob + "]";
	}

}
