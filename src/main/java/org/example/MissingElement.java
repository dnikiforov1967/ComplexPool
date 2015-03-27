package org.example;

/*

A zero-indexed array A consisting of N different integers is given. 
The array contains integers in the range [1..(N + 1)], 
which means that exactly one element is missing.

Your goal is to find that missing element.
Write a function:

 int solution(int A[], int N); 

that, given a zero-indexed array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5

the function should return 4, as it is the missing element.

Assume that:

•N is an integer within the range [0..100,000];
•the elements of A are all distinct;
•each element of array A is an integer within the range [1..(N + 1)].

Complexity:

•expected worst-case time complexity is O(N);
•expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.

Copyright 2009–2015 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited. 
*/

public class MissingElement {

	public int solution(int A[]) {
        long sum = 0;
        long rightSum = 0;
        for(int i=0; i<A.length; i++) sum += A[i];
		rightSum = (A.length+2);
		rightSum *= (long)(A.length+1);
		rightSum /= 2;
		System.out.println(rightSum);
        return (int)((rightSum - sum));
	}

}
