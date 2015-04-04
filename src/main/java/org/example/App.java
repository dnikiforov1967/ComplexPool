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
		int[] A = new int[6];
		A[0] = -200;
		A[1] = -199;
		A[2] = -198;
		A[3] = -197;
		A[4] = -196;
		A[5] = -195;		
		System.out.println(new MaxSlice().solution(A));
    }
}