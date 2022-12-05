package codingTest.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class test12 {
	
	public static void main(String[] args) {
		String s="baabaa";
		int answer=0;
	
		Stack<String> stack=new Stack<String>();
		for(int i=0; i<s.length(); i++) {
			if(!stack.isEmpty() && stack.peek().equals(s.substring(i,i+1))) {
				stack.pop();
			}else {
				stack.push(s.substring(i,i+1));
			}
		}
		if(stack.isEmpty()) {
			answer=1;
		}
		System.out.println(answer);
	}


}
