package org.example;

import java.util.*;

/*

*/

public class Triangular {

	public int solution(int[] A) {
        if (A.length<3) return 0;
        Arrays.sort(A);
        int rslt; int sum = 0;
        
        for(int i = 0; i<A.length-3; i++) {
           if ((long)A[i]+(long)A[i+1] > (long)A[i+2]) {
               sum = 1; break;
           }
        } 
        return sum;   		
	}

}