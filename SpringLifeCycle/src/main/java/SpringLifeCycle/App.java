package SpringLifeCycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
    public static void main( String[] args )  throws Exception

    {
        ConfigurableApplicationContext lyf = new ClassPathXmlApplicationContext("Bean.xml");
  
        lyf.close();
        
    }

}
