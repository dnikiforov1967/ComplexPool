package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
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
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
		int[] A = new int[] {0,1,2,3,4,5,4,3,2,1,0};
		int[] B = new int[] {10,0,0,0,0,0,0,0,0,0,5};
		int[] C = new int[] {10,1,2,3,4,5,4,3,2,1,0};
		int[] D = new int[] {6,0,10,0,0,0,0,0,7,0,6};
        assertEquals(0,new ComplexPool().pool(A));
		assertEquals(45,new ComplexPool().pool(B));
		assertEquals(10,new ComplexPool().pool(C));
		assertEquals(47,new ComplexPool().pool(D));
    }
}
