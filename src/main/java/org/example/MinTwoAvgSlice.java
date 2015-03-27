package org.example;

/*

A non-empty zero-indexed array A consisting of N integers is given. A pair of integers (P, Q), 
such that 0 ≤ P < Q < N, is called a slice of array A (notice that the slice contains at least two elements). 
The average of a slice (P, Q) is the sum of A[P] + A[P + 1] + ... + A[Q] divided by the length of the slice. 
To be precise, the average equals (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).

For example, array A such that:

    A[0] = 4
    A[1] = 2
    A[2] = 2
    A[3] = 5
    A[4] = 1
    A[5] = 5
    A[6] = 8

contains the following example slices:

•slice (1, 2), whose average is (2 + 2) / 2 = 2;
•slice (3, 4), whose average is (5 + 1) / 2 = 3;
•slice (1, 4), whose average is (2 + 2 + 5 + 1) / 4 = 2.5.

The goal is to find the starting position of a slice whose average is minimal.

Write a function:

 int solution(int A[], int N); 

that, given a non-empty zero-indexed array A consisting of N integers, 
returns the starting position of the slice with the minimal average. 
If there is more than one slice with a minimal average, you should return the smallest starting position of such a slice.

For example, given array A such that:

    A[0] = 4
    A[1] = 2
    A[2] = 2
    A[3] = 5
    A[4] = 1
    A[5] = 5
    A[6] = 8

the function should return 1, as explained above.

Assume that:

•N is an integer within the range [2..100,000];
•each element of array A is an integer within the range [−10,000..10,000].

Complexity:

•expected worst-case time complexity is O(N);
•expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.

Copyright 2009–2015 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited. 

(Avg1*n + Avg2*m)/(n+m) > Avg1  => Avg2 > Avg1.

Hence if we found minumum Avg amongh (2) or (3) slices, we get absolute minimum - all others are greater.

*/

public class MinTwoAvgSlice {

    public int solution(int[] A) {
        // write your code in Java SE 8
		long[] prefSum = new long[A.length];
		prefSum[0] = A[0];
		for(int i=1; i<A.length; i++) {
			prefSum[i] = A[i] + prefSum[i-1];
		}
		
		long avg2=0, avg3=0;
		int idx2 = 0, idx3 = 0;
		
		
		for(int i=0; i<A.length-1; i++) {
			if (i == 0) avg2 = prefSum[i+1];
			else
				if (avg2 > (prefSum[i+1]-prefSum[i-1])) { avg2 = (prefSum[i+1]-prefSum[i-1]); idx2 = i;}
		}
		
		for(int i=0; i<A.length-2; i++) {
			if (i == 0) avg3 = prefSum[i+2];
			else
				if (avg3 > (prefSum[i+2]-prefSum[i-1])) { avg3 = (prefSum[i+2]-prefSum[i-1]); idx3 = i;}
		}	
		if (avg2*3 > avg3*2) idx2 = idx3;
		return idx2;	
    }

}