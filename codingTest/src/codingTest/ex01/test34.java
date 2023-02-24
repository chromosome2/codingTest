package codingTest.ex01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class test34 {

	public static void main(String[] args) {
		String[] phone_book= {"1234", "2345", "3465", "4567", "5687", "6789", "7890", "4321", "5432", "6554", "7654", "8756", "9876", "0987", "4132", "52534", "3645", "6345", "6345567780987098709087"};
		boolean answer=true;
		
		Arrays.sort(phone_book);
		
		for(int i=0; i<phone_book.length-1; i++) {
			if(phone_book[i+1].startsWith(phone_book[i])) {
				answer=false;
			}
		}
		
		System.out.println(answer);

	}

}
