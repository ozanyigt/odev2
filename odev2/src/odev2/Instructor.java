package odev2;

public class Instructor extends User {
	private String firstName;
	private String lastName;
	private String course;

public Instructor(int id,String firstName, String lastName,String email, String course) {
	super();
	this.id=id;
	this.email=email;
	this.firstName = firstName;
	this.lastName = lastName;
	this.course = course;
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
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
}

