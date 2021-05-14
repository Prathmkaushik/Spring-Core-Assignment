package Annotations;

public class App {
	public static void main( String[] args )
    {
 
    	  ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
    	  StudentController controller = (StudentController) context.getBean("obj");
    	  Student obj = controller.createNewStudent();
    	  System.out.println("ID : " + obj.getStudentId());
    	  System.out.println("Name : " + obj.getStudentId());
        //System.out.println( "Hello World!" );
    	  
    }

}
