package codingTest.ex01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		int answer=0;
		
		int[] a= {1,4,2};
		int[] b= {5,4,4};
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				if(b[i]>b[j]) {
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			answer+=a[i]*b[a.length-i-1];
		}
		
		System.out.println(answer);

	}

}
