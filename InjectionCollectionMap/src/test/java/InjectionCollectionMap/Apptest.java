package InjectionCollectionMap;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.desktop.AppEvent;

import org.junit.jupiter.api.Test;

import junit.framework.TestSuite;

public class Apptest {

	 @Test
	
	    /**
	     * Create the test case
	     *
	     * @param testName name of the test case
	     * @return 
	     */
	    public String AppTest( String testName )
	    {
	        return( testName );
	    }

	    /**
	     * @return the suite of tests being tested
	     */
	    public static TestSuite suite()
	    {
	        return new TestSuite( AppEvent.class );
	    }

	    /**
	     * Rigourous Test :-)
	     */
	    public void testApp()
	    {
	        assertTrue( true );
	    }
}
