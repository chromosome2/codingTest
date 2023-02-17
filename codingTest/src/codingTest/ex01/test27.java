package codingTest.ex01;

import java.util.Arrays;

public class test27 {

	public static void main(String[] args) {
		int n=4;
		long left=7;
		long right=14;
		
		int[] answer= new int[(int)(right-left)+1];
		
		int[] list=new int[n];
		for(int i=1; i<=n; i++) {
			list[i-1]=i;
		}
		
		int[] left_array=new int[] {(int)(left/n), (int)(left%n)};
		int[] right_array=new int[] {(int)(right/n), (int)(right%n)};
		
		int answer_index=0;
		while(true) {
			for(int i=0; i<left_array[0]; i++) {
				list[i]=list[left_array[0]];
			}
			if(right_array[0]==left_array[0]) {
				for(int i=left_array[1]; i<=right_array[1]; i++) {
					answer[answer_index]=list[i];
					answer_index++;
				}
				break;
			}
			for(int i=left_array[1]; i<list.length; i++) {
				answer[answer_index]=list[i];
				answer_index++;
			}
			left_array[1]=0;
			left_array[0]++;
		}
		
		

		System.out.println(Arrays.toString(answer));

	}

}
/*
 * 
			System.out.println("1 : "+Arrays.toString(list));
			if(right_array[0]>left_array[0]) {
				System.out.println("2 : "+right_array[0]);
				System.out.println("3 : "+left_array[0]);
				for(int i=left_array[1]; i<list.length; i++) {
					System.out.println("4 : "+answer_index + " / "+i);
					answer[answer_index]=list[i];
					answer_index++;
					System.out.println("5 : "+Arrays.toString(answer));
				}
				left_array[0]++;
			}else {
				System.out.println("6");
				for(int i=0; i<=right_array[1]; i++) {
					answer[answer_index]=list[i];
					answer_index++;
					System.out.println("7 : "+Arrays.toString(answer));
				}
				break;
			}
 * */