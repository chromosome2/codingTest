package codingTest.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test4 {

	public static void main(String[] args) {
		boolean answer=true;
		String s="(()(";
		/*String[] split_s=s.split("");
		List<String> sp_list=new ArrayList<String>();
		for(int i=0; i<split_s.length; i++) {
			sp_list.add(split_s[i]);
		}
		System.out.println(sp_list);
		int count=0;
		int i=0;
		
		while(true) {
			
			if(sp_list.size()==0 || sp_list.size()%2!=0 || sp_list.get(0).equals(")")) {
				System.out.println(1);
				if(count!=0 && sp_list.size()==0) {
					System.out.println(2);
					answer=true;
				}else {
					System.out.println(3);
					answer=false;
				}
				break;
			}
			if(sp_list.size()!=0 && sp_list.indexOf(")")==-1) {
				answer=false;
				break;
			}
			
			if(i<sp_list.size()-1) {
				if(sp_list.get(i+1).equals(")")) {
					System.out.println(4);
					sp_list.remove(i+1);
					sp_list.remove(i);
					count++;
					i=0;
				}else {
					System.out.println(5);
					i++;
				}
			}
			System.out.println(6);
			System.out.println(sp_list);
		}
		System.out.println(answer);*/
		
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') {
				count++;
			}else {
				count--;
			}
			if(count<0) {
				answer=false;
				break;
			}
		}
		
		if(count==0) {
			answer=true;
		}
	}

}
