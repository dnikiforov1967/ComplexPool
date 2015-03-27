package org.example;

public class MergeSort {

		private void subSort(int[] A, int x, int y) {
			if (x == y) return;
			int m = (x+y)/2;
			subSort(A,x,m);
			subSort(A,m+1,y);
			int i=x, j=m+1;
			int[] B = new int[y-x+1];
			int k = 0;
			while(i<=m && j<=y) {
				if (A[i] <= A[j]) B[k++] = A[i++]; else B[k++] = A[j++]; 
			}
			if (i<=m) while(i<=m) B[k++] = A[i++];
			if (j<=y) while(j<=y) B[k++] = A[j++];
			for(int s = 0; s < B.length; s++) A[x++] = B[s];
		}

		public void sort(int[] A) {
			subSort(A,0,A.length-1);
		}
		
}