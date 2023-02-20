package codingTest.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class test28 {

	public static void main(String[] args) {
		int k=6;
		int[] tangerine= {1, 3, 2, 5, 4, 5, 2, 3};
		int answer=0;
		
		HashMap<Integer, Integer> hashmap=new HashMap<>();
		
		for(int t: tangerine) {
			if(hashmap.containsKey(t)) {
				hashmap.put(t, hashmap.get(t)+1);
			}else {
				hashmap.put(t, 1);
			}
		}
		
		List<Integer> values_list=new ArrayList<>(hashmap.values());
		
		Collections.sort(values_list, Collections.reverseOrder());
		
		int hap=0;
		for(int value:values_list) {
			System.out.println(value);
			if(hap<k) {
				hap+=value;
				answer++;
			}else {
				break;
			}
		}
		
		System.out.println("답 : "+answer);

	}

}
