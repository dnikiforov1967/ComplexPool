package org.example;

public class MaxSlice {

    public long mog(long[] A) {
		//Есть начальная точка
            long delta = Integer.MIN_VALUE;
			long maxV = Integer.MIN_VALUE;
			long minV = A[0];
			int indexMin = 0; int indexMax = 0;
			for(int i =1; i<A.length-1; i++) {
				if(A[i-1] >= A[i] && A[i] <= A[i+1] && A[i] < minV) { minV = A[i]; indexMin = i; }
				if(A[i-1] <= A[i] && A[i] >= A[i+1] && A[i] > maxV) { maxV = A[i]; indexMax = i; }
				//Maximum is ahead of minimum
				if (indexMax > indexMin) { 
					delta = Math.max(delta,A[indexMax] - A[indexMin]); 
					maxV = Integer.MIN_VALUE; 
				}
				delta = Math.max(delta,A[A.length-1] - minV); //Check the last way
			}	
        return delta; 
	}       
    
    public int solution(int[] A) {
        // write your code in Java SE 8
        long sum = 0;
        long[] B = new long[A.length+1];
        if (A.length==1) return A[0];
        if (A.length==2) return Math.max(Math.max(A[0],A[1]), A[0]+A[1]);
        for(int i=0; i<A.length; i++) {
            sum += A[i]; B[i+1]=sum;
        }    
        int bix = (int)mog(B); //In case of no max as of [i,j] (i < j)
		for(int i=0; i <A.length; i++) {
			bix = Math.max(bix, A[i]);
		}
		return bix;
    }
      

}