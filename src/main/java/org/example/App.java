package org.example;

import java.util.Stack;
/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
		int[] A = new int[] {8,3,4,};
		new HeapSort().sort(A);
		for(int i=0; i<A.length; i++) 
			System.out.println(A[i]);
    }
}
