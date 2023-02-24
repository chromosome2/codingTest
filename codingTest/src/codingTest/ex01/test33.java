package codingTest.ex01;

import java.util.HashSet;

public class test33 {

	public static void main(String[] args) {
		int[] elements= {100,15,20,1,7,4,1,1,5,18,999,634,17};
		int answer=0;
		
		int index=1;
		HashSet<Integer> set=new HashSet<>();
		
		for(int i=0; i<elements.length; i++) {
			for(int j=0; j<elements.length; j++) {
				int hap=0;
				for(int z=j; z<j+index; z++) {
					hap+=elements[z%elements.length];
					System.out.print(elements[z%elements.length] + " / ");
				}
				System.out.println(" = "+hap);
				set.add(hap);
				if(i==elements.length-1) {
					break;
				}
			}
			System.out.println("====");
			index++;
		}
		answer=set.size();
		
		System.out.println(answer);

	}

}
