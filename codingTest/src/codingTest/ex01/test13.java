package codingTest.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class test13 {

	public static void main(String[] args) {
		int[] people= {20,40,50,60,80,90};
		int limit=100;
		int answer=0;
		
		Arrays.sort(people);
		List<Integer> list=new ArrayList<Integer>();
		for(int p : people) {
			list.add(p);
		}
		while(!list.isEmpty()) {
			int max=list.remove(list.size()-1);
			if(list.size()>=1 && max+list.get(0)<=limit) {
				 list.remove(0);
			}
			answer++;
		}
		System.out.println(answer);
	}

}
