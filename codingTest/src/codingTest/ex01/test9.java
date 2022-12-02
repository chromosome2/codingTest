package codingTest.ex01;

public class test9 {

	public static void main(String[] args) {
		int brown=24;
		int yellow=24;
		int[] answer= new int[2];
		
		int width=0, height=0;
		
		for(int i=1; i<=yellow; i++) {
			if(yellow%i==0) {
				width=yellow/i+2;
				height=i+2;
				
				int result=width*2+height*2-4;
				
				if(brown==result) {
					break;
				}
			}
		}
		
		answer[0]=width;
        answer[1]=height;
		
		System.out.println(answer[0]+"/"+answer[1]);

	}

}
