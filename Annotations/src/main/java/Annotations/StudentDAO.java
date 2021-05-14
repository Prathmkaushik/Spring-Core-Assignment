package Annotations;

import org.springframework.stereotype.Repository;

@Repository("StudentDAO")
public class StudentDAO {
	public Student createNewStudent() {
		Student student = new Student("Pratham", 121);
		  return student;
		 }

}
