package codingTest.ex01;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class test29 {

	public static void main(String[] args) {
		int[] priorities= {1, 1, 2, 3, 2, 1};
		int location=0;
		int answer=0;

		Queue<Integer> pri_queue=new LinkedList<>();
		for(int p : priorities) {
			pri_queue.add(p);
		}
		
		Arrays.sort(priorities);
		
		
		int index=priorities.length-1;
		while(location>=0) {
			if(pri_queue.peek()<priorities[index]) {
				pri_queue.add(pri_queue.peek());
				pri_queue.remove();
				if(location==0) {
					location+=pri_queue.size()-1;
				}else{
					location--;
				}
			}else {
				pri_queue.remove();
				answer++;
				location--;
				index--;
			}
		}
		
		
		
		System.out.println("답 : "+answer);

	}

}
