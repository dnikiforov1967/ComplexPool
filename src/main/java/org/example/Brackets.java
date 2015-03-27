package org.example;

import java.util.*;


public class Brackets {
	
	private final char[] pair1 = {'(',')'};
	private final char[] pair2 = {'[',']'};
	private final char[] pair3 = {'{','}'};

	private boolean isPair(char x, char y) {
		char[] ret = new char[] {x,y}; 
		return Arrays.equals(pair1, ret) || Arrays.equals(pair2, ret) || Arrays.equals(pair3, ret);
	}
	
	private boolean isOpen(char x) {
		return (x=='(' || x == '{' || x == '[');
	}
	
	public int solution(String S) {
		if (S.length()==0) return 1;
		else {
			Stack<Character> charStack = new Stack<>();
			for(int i=0; i<S.length(); i++) {
				char b = S.charAt(i);
				if (isOpen(b)) charStack.push(b);
				else {
					if (charStack.size() > 0) {
						char c = charStack.pop();
						if (!isPair(c,b)) return 0;						
					}
					else return 0;
				}
			}
			if (charStack.size() > 0) return 0; else return 1;
		}
	}

}