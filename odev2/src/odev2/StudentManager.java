package odev2;

public class StudentManager {
	public void add(Student student) {
		System.out.println("Öğrenci kaydı yapıldı  "+ student.getFirstName());
	}
	public void delete(Student student) {
		System.out.println("Öğrenci silindi  "+ student.getFirstName());
	}
	
	

}
