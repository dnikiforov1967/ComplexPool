package org.example;

public class HeapSort {
	
	private int left(int i) {
		return 2*i+2;
	}

	private int right(int i) {
		return 2*i+1;
	}	
	
	private void swap(int[] A, int x, int y) {
		int tmp = A[x];
		A[x] = A[y]; A[y] = tmp;
	}
	
	private void buildSubHeap(int[] A, int length, int i) {
		int l = left(i);
		int r = right(i);
		int max = i;
		if (l < length && A[i] < A[l]) max = l;
		if (r < length && A[max] < A[r]) max = r;
		if (max != i) { swap(A, i, max); buildSubHeap(A, length, max);}
	}

	private void buildHeap(int[] A) {
		for(int i = A.length/2; i>=0; i--) 
			buildSubHeap(A, A.length, i);
	}
	
	public void sort(int[] A) {
		buildHeap(A);
		int index = A.length - 1;
		while (index > 0) {
			swap(A, 0, index);
			buildSubHeap(A, index, 0);
			index--;
		}		
	}

}