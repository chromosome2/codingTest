package codingTest.ex01;

import java.util.Arrays;

public class test19 {

	public static void main(String[] args) {
		int[] citations= {0,1,1,2,3,5,6};
		int answer=0;
		
		/*for(int i=citations.length; i>0; i--) {
			int count=0;
			int n_count=0;
			for(int x : citations) {
				if(i<=x) {
					count++;
				}else {
					n_count++;
				}
			}
			if(count>=i && n_count<=i) {
				answer=i;
				break;
			}
		}*/
		
		Arrays.sort(citations);

        int max = 0;
        for(int i = citations.length-1; i > -1; i--){
            int min = (int)Math.min(citations[i], citations.length - i);
            if(max < min) max = min;
        }
		
		System.out.println(max);

	}

}
