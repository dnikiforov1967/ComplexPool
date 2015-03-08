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
		Stack<Integer> l = new Stack<>();
		for(int i = 1; i<100000; i++) l.push(i);
		l.push(100001);
		int[] A = new int[l.size()];
		for(int i=0; i<A.length; i++) A[i] = l.pop();
        System.out.println(new MissingElement().solution(A));
    }
}
