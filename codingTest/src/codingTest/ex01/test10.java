package codingTest.ex01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test10 {

	public static void main(String[] args) {
		int n=2;
		String[] words={"hello", "one", "even", "never", "now", "world", "draw","one"};
		List<String> words_list=new ArrayList<String>();
		int[] answer= {0,0};
		int index;
		
		words_list.add(words[0]);
		for(int i=1; i<words.length; i++) {
			index=words_list.indexOf(words[i]);
			if(index==-1 && words[i-1].charAt(words[i-1].length()-1)==words[i].charAt(0)) {
				words_list.add(words[i]);
			}else {
				answer[0]=(i%n)+1;
				answer[1]=(i/n)+1;
				break;
			}
		}

	}

}
