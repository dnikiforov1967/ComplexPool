package org.example;

import java.util.*;

public class Dominator {

    public int getDominator(int[] A) {
		int elem = A[0];
		int count = 0;	
        for(int i : A) {
			if (i==elem) count++;
			else {
				if (count == 0) { elem = i; count++; }
				else count--;
			}
        }
		
		int ret = -1;
		count = 0;
		for(int i = 0; i<A.length; i++) {
			if (A[i]==elem) { count++; ret=i; } 
		}
		if (count > A.length/2) return ret;
		else return -1;
	}       

}