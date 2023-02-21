package codingTest.ex01;

import java.util.Arrays;

public class test31 {

	public static void main(String[] args) {
		long n=12345;
		
		String s=String.valueOf(n);
		String[] s_split=s.split("");
		int[] answer=new int[s_split.length];
		
		int index=s_split.length-1;
		for(int i=0; i<s_split.length; i++) {
			answer[i]=Integer.parseInt(s_split[index]);
			index--;
		}
		
		System.out.println(Arrays.toString(answer));

	}

}
