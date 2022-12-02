package codingTest.ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test11 {

	public static void main(String[] args) {
		String[] operations= {"I 1", "I 2", "I 3", "I 4", "I 5", "D -1", "D -1","D -1", "D -1"};
		int[] answer= {0,0};
		
		List<Integer> list=new ArrayList();
		int max=0,min=0;
		for(int i=0; i<operations.length; i++) {
			String[] ope_split=operations[i].split(" ");
			System.out.println(ope_split[0]+" / "+ ope_split[1]);
			
			if(ope_split[0].equals("I")) {
				list.add(Integer.parseInt(ope_split[1]));
				System.out.println(list);
			}else {
				if(list.isEmpty()) {
					continue;
				}
				if(ope_split[1].equals("1")) {
					System.out.println("**"+1);
					max=Collections.max(list);
					System.out.println(max);
					list.remove(list.indexOf(max));
					System.out.println(list);
				}else{
					System.out.println("**"+-1);
					min=Collections.min(list);
					System.out.println(min);
					list.remove(list.indexOf(min));//list.remove(index)
					System.out.println(list);
				}
			}
		}
		
		if(!list.isEmpty()) {
			max=Collections.max(list);
			min=Collections.min(list);
			answer[0]= max;
			answer[1]= min;
		}
		
		System.out.println(answer[0]+" / "+answer[1]);
		

	}

}
