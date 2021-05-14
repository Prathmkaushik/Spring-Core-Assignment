package AnnotationQ5;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import AnnotationQ5.model.Student;
import AnnotationQ5.StudentRepository;


public class App {
	public static void main( String[] args ) throws SQLException
    {
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("AnnotationQ5");
		context.refresh();

		StudentRepository repository = context.getBean(StudentRepository.class);

		
		ObjectRepository.store();
		repository.store(new Student(2, "Rahul", "ECE"));
		repository.store(new Student(3, "Pratham", "CS"));

	
		Student stu = repository.retrieve(1);
		System.out.println(stu);

		
		Student top = repository.search("Rahul");
		System.out.println(top);

		
		Student Delete = repository.delete(2);
		System.out.println(Delete);

	
		context.close();
	}
        

}
