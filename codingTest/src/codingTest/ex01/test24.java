package codingTest.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class test24 {

	public static void main(String[] args) {
		String[][] clothes= {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
		int answer=0;
		
		HashSet<String> set=new HashSet<String>();
		List<String> clothes_subject=new ArrayList<String>();
		for(int i=0; i<clothes.length; i++) {
			if(set.add(clothes[i][1])) {
				clothes_subject.add(clothes[i][1]);
			}
		}
		
		int[] count= new int[clothes_subject.size()];
		int index=0;
		for(String list_sub:clothes_subject) {
			for(int i=0; i<clothes.length; i++) {
				if(list_sub.equals(clothes[i][1])) {
					count[index]++;
				}
			}
			index++;
		}
		
		int sum=1;
		for(int i=0; i<count.length; i++) {
			sum=sum*(1+count[i]);
		}
		
		answer=sum-1;
		
		System.out.println(answer);

	}

}
