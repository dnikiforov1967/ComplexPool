package org.example;

public class QuickSort {
	
	
	public void sort(int[] A) {
		subSort(A,0,A.length-1);
	}
	
	private void subSort(int A[], int left, int right) { 

		int i = left, j = right; 
		int tmp; 
		int median = A[(left + right) / 2]; 

		while (i <= j) { 
			while (A[i] < median) i++; 
            while (A[j] > median) j--; 

            if (i <= j) { 
                  tmp = A[i]; 
                  A[i] = A[j]; 
                  A[j] = tmp; 
                  i++; 
                  j--; 
            } 
		}
	
		if (left < i - 1) 
            subSort(A, left, i - 1); 
		if (i < right) 
            subSort(A, i, right); 
	}
	
	

}