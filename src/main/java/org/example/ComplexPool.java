package org.example;

/* Class models the task about complex pool */
public class ComplexPool {

	public int pool(int[] A) {
		int i = 0,j = A.length-1;
		int volume = 0;
		int left = 0, right = 0;
		int wl =0;
		while(i < j) {
			//While left wall is less or equal to right one and until pointers become the same
			while(i < j && A[i] <= right) {
				if (A[i] <= wl) //Wall under water
					volume += wl-A[i];
				else
					wl = A[i]; //Wall over water - add water to the edge
				i++;
			}
			left = A[i]; wl = right; //Keep left and change whater level
			//The same for right side - go to the left
			while(j > i && A[j] <= left) {
				if (A[j] <= wl) 
					volume += wl-A[j];
				else
					wl = A[j]; 
				j--;
			}		
			right = A[j]; wl = left;
		}
		return volume;
		
	}	

}