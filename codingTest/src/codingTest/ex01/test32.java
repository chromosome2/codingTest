package codingTest.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class test32 {

	public static void main(String[] args) {
		String str1="bbbb12";
		String str2="aaaa12";
		int answer=0;
		
		String pattern="[A-Z]";
		
		String[] str1_split=str1.toUpperCase().split("");
		String[] str2_split=str2.toUpperCase().split("");
		
		List<String> str1_list=new ArrayList<>();
		List<String> str2_list=new ArrayList<>();
		
		for(int i=0; i<str1_split.length-1; i++) {
			boolean c1_result=str1_split[i].matches(pattern);
			boolean c2_result=str1_split[i+1].matches(pattern);
			if(c1_result && c2_result) {
				str1_list.add(str1_split[i]+str1_split[i+1]);
			}
		}
		for(int i=0; i<str2_split.length-1; i++) {
			boolean c1_result=str2_split[i].matches(pattern);
			boolean c2_result=str2_split[i+1].matches(pattern);
			if(c1_result && c2_result) {
				str2_list.add(str2_split[i]+str2_split[i+1]);
			}
		}
		
		if(str1_list.size()==0 && str2_list.size()==0){
            answer=65536;
            //return answer;
        }
		
		int union=str1_list.size()+str2_list.size();
		int intersection=0;
		for(String str : str1_list) {
			if(str2_list.contains(str)) {
				str2_list.remove(str);
				intersection++;
			}
		}
		
		union-=intersection;
		answer=(int)(((double)intersection/union)*65536);
		
		System.out.println(answer);

	}

}
