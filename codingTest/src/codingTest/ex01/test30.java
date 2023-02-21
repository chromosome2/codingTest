package codingTest.ex01;

import java.util.HashSet;

public class test30 {

	public static void main(String[] args) {
		int[] nums= {3,1,2,3};
		int answer=0;
		
		HashSet<Integer> hashset=new HashSet<>();
		
		for(int n: nums) {
			hashset.add(n);
		}
		
		if(hashset.size()>nums.length/2) {
			answer=nums.length/2;
		}else {
			answer=hashset.size();
		}
		
		System.out.println(answer);

	}

}
