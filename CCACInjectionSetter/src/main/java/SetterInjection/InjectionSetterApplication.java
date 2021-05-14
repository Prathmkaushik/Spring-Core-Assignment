package SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectionSetterApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");  
        Customer obj = (Customer)applicationContext.getBean("obj");
        obj.display(); 
    	System.out.println("Hello Guys");

			}


}
