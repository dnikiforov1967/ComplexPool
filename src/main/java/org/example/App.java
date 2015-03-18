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
		int[] A = new int[] {-3,-9,-5,-1,-2};
		new QuickSort().sort(A);
		for(int i=0; i<A.length; i++) 
			System.out.println(A[i]);
    }
}