package org.example;

import java.util.*;

/*


Given an array A of N integers, we draw N discs in a 2D plane such that the I-th disc is centered on (0,I)
and has a radius of A[I]. 
We say that the J-th disc and K-th disc intersect if J ≠ K and J-th and K-th discs have at least one common point.

Write a function:


 class Solution { public int solution(int[] A); } 

that, given an array A describing N discs as explained above, returns the number of pairs of intersecting discs. For example, given N=6 and:


A[0] = 1  A[1] = 5  A[2] = 2
A[3] = 1  A[4] = 4  A[5] = 0

intersecting discs appear in eleven pairs of elements:

•0 and 1,
•0 and 2,
•0 and 4,
•1 and 2,
•1 and 3,
•1 and 4,
•1 and 5,
•2 and 3,
•2 and 4,
•3 and 4,
•4 and 5.

so the function should return 11.

The function should return −1 if the number of intersecting pairs exceeds 10,000,000.

Assume that:

•N is an integer within the range [0..100,000];
•each element of array A is an integer within the range [0..2,147,483,647].

Complexity:

•expected worst-case time complexity is O(N*log(N));
•expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.

Copyright 2009–2015 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited. 
*/

class Disk implements Comparable<Disk> {
       private int i, radius;
       Disk(int i, int radius) { this.i=i; this.radius=radius; }
       public int compareTo(Disk d) {
             return ((i-radius)-(d.i-d.radius));
       }      

       public int getRight() { return i+radius; }
       public int getLeft() { return i-radius; }

};




public class NumberOfDiskIntersection {

    public int find(Disk[] A, int start) {
        int retval = 0;
		int N=A.length-1;
		if (N+1<=1) return retval; //0 or 1 disk
		
		
        int left = start;
        int right = (N-start)/2+1; //Begin from middle
        int rEdge = A[start].getRight(); //
		
		while(true) {
			if (A[right].getLeft() <= rEdge) {
				if (right == N) { //
					retval = right-start; break;
				}      
				left = right; 
				right = (A.length-1+left)/2+1;
			}
			if (A[right].getLeft() > rEdge) {
				if (right <= left+1) { //
					retval = left-start; break;
				}                          
				right = (left+right)/2; 
			}                   
		}
		return retval;
	}    

    public int solution(int[] A) {

        // write your code in Java SE 8
		int count = 0;
		Disk[] D = new Disk[A.length];
		for(int i= 0; i<A.length; i++) D[i] = new Disk(i,A[i]);
		Arrays.sort(D);
		//Integer p = new Scanner(System.in).nextInt();
		for(int i= 0; i <D.length-1; i++)
			count += find(D,i);      
		if (count > 10000000) count = -1;
		return count; 

    }

}