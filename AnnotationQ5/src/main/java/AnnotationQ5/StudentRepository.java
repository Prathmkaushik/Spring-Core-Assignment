package AnnotationQ5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import AnnotationQ5.model.Student;
@Repository 
public class StudentRepository implements 
ObjectRepository <Student> {
	private Map<Integer, Student> repository;
	 
	public StudentRepository() {
		this.repository = new HashMap<Integer, Student>();
	}
	public void store(AnnotationQ5.model.Student student) {
		repository.put(student.getStudentId(), student);
	}
	public Student retrieve(int studentId) {
		return repository.get(studentId);
	}
	public Student search(String stdentName) {
		Collection<Student> stus = repository.values();
		for (Student stu : stus) {
			if (stu.getStudentName().equalsIgnoreCase(stdentName))
				return stu;
		}
		return null;
	}
	public Student delete(int studentId) {
		Student S = repository.get(studentId);
		this.repository.remove(studentId);
		return S;
	}
	public void store(Student t) {
		// TODO Auto-generated method stub
		
	}

}

