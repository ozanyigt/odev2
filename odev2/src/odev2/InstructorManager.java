package odev2;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println("Eðitmen eklendi  "+ instructor.getFirstName());
	}
	public void delete(Instructor instructor) {
		System.out.println("Eðitmen silindi  "+ instructor.getFirstName());
	}

}
