package CoreQuestion6;

import java.sql.SQLException;
public class App {
	{
		public static void main( String[] args ) throws SQLException
		{
    	
	    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.scan("CoreQuestion6");
			context.refresh();
			System.out.println("Refreshing the spring context");
			ConnectionsClass Connection = context.getBean(ConnectionsClass.class);
	
			ConnectionsClass.printDBConfigs();
			
		
			context.close();
	}
       
}

}
