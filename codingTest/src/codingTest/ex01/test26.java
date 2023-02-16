package codingTest.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class test26 {

	public static void main(String[] args) {
		int[] progresses= {93, 30, 55};
		int[] speeds = {1,30,5};
		int[] answer;
		
		Queue<Integer> queue=new LinkedList<>();
		
		int index=0;
		for(int prog:progresses) {
			int count=0;
			while(prog<100) {
				prog+=speeds[index];
				count++;
			}
			queue.add(count);
			index++;
		}
		
		int day=queue.peek();
		List<Integer> day_count_list=new ArrayList<>();
		int count=0;
		while(queue.size()!=0) {
			if(queue.peek()<=day) {
				queue.remove();
				count++;
			}else {
				System.out.println(count);
				day_count_list.add(count);
				day=queue.peek();
				count=0;
			}
		}
		day_count_list.add(count);
		
		answer=new int[day_count_list.size()];
		for(int i=0; i<day_count_list.size(); i++) {
			answer[i]=day_count_list.get(i);
		}

		System.out.println(Arrays.toString(answer));

	}

}