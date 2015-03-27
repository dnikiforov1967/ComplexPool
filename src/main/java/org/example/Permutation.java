package org.example;

/*
A non-empty zero-indexed array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2

is a permutation, but array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3

is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:

 class Solution { public int solution(int[] A); } 

that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2

the function should return 1.

Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3

the function should return 0.

Assume that:

•N is an integer within the range [1..100,000];
•each element of array A is an integer within the range [1..1,000,000,000].

Complexity:

•expected worst-case time complexity is O(N);
•expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.

Copyright 2009–2015 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited. 
*/

public class Permutation {
	
    public int solution(int[] A) {
        // write your code in Java SE 8
		int flag = 0;
		int sum = 0;
		int[] counter = new int[A.length];
		int N = A.length;
		for(int i = 0; i < N; i++) {
			if (A[i] >= 1 && A[i] <= N) { //i in the range
				counter[A[i]-1]++; //increase count
				if (counter[A[i]-1]>1) return flag; //No permutable - duplicates
			}
			else return flag;
		}
		for(int i=0; i<N; i++) sum += counter[i];
		if (sum == N) flag = 1;
		return flag;    
    }

}