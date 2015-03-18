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
		int[] A = new int[] {8,3,7,1,2,10,5};
		new MergeSort().sort(A);
		for(int i=0; i<A.length; i++) 
			System.out.println(A[i]);
    }
}
