package odev2;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println("E�itmen eklendi  "+ instructor.getFirstName());
	}
	public void delete(Instructor instructor) {
		System.out.println("E�itmen silindi  "+ instructor.getFirstName());
	}

}
