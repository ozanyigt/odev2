package odev2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Barış","Tan","baristan@gmail.com","C#");
		Student student2 = new Student(2,"Onur","Tan","onurtan@gmail.com","Java");
		
		Instructor instructor1 = new Instructor(1,"Engin","Demiroğ","asdasd@gmail.com","C# ve Java");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.delete(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		
		
	}

}
