package codingTest.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class test23 {

	public static void main(String[] args) {
		String s= "{{1,2,3,10},{10,2},{10,2,1},{1,2,10,4,3},{2}}";
		
		Set<String> set = new HashSet<>();
        String[] s_new=s.replaceAll("\\},", "/").replaceAll("[{}]", "").split("/");
        
        int[] answer = new int[s_new.length];
        
        Arrays.sort(s_new, (a, b)->{return a.length() - b.length();});
        int i=0;
        for(String s1: s_new) {
        	for(String s2 : s1.split(",")) {
        		if(!set.contains(s2)) {
        			set.add(s2);
        			answer[i]=Integer.parseInt(s2);
        			i++;
        		}
        	}
        }
		
		System.out.println(Arrays.toString(answer));

	}

}
