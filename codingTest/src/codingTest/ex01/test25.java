package codingTest.ex01;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class test25 {

	public static void main(String[] args) {
		int cacheSize=0;
		String[] cities= {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		int answer=0;

		LinkedHashMap<String, String> list = new LinkedHashMap<String, String>(){
			@Override
			protected boolean removeEldestEntry(java.util.Map.Entry<String, String> eldest) {
				return size() == cacheSize+1 ? true : false; 
            }
        };
        
        for(String city:cities) {
        	city=city.toLowerCase();
        	if(list.containsKey(city)) {
        		list.remove(city);
        		list.put(city, city);
        		answer+=1;
        	}else {
        		list.put(city, city);
        		answer+=5;
        	}
        }
        System.out.println(answer);
        answer=0;
		
		Queue<String> list_q = new LinkedList<>();
		if(cacheSize==0) {
			answer=cities.length*5;
		}else {
			for(String city : cities) {
				city=city.toLowerCase();
				if(list_q.contains(city)) {
					list_q.remove(city);
					list_q.add(city);
					answer+=1;
				}else {
					if(list_q.size()==cacheSize) {
						list_q.remove();
					}
					list_q.add(city);
	        		answer+=5;
				}
			}
		}
		
		System.out.println(answer);
	}

}
