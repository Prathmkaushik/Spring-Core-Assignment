import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class App 

	 extends TestCase
	 {
	     /**
	      * Create the test case
	      *
	      * @param testName name of the test case
	      */
	     public AppTest( String testName )
	     {
	         super( testName );
	     }

	     /**
	      * @return the suite of tests being tested
	      */
	     public static Test suite()
	     {
	         return (Test) new TestSuite( AppTest.class );
	     }

	     /**
	      * Rigourous Test :-)
	      */
	     public void testApp()
	     {
	         assertTrue( true );
	     }
	 
}
