package codingTest.ex01;

public class test14 {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3};
		
		int max_gop=0;
		int i=1;
		while(true) {
			max_gop=arr[arr.length-1]*i;
			int result=0;
			for(int j=0; j<arr.length-1; j++) {
				System.out.println(max_gop + " / "+ arr[j]);
				System.out.println("³ª¸ÓÁö : "+max_gop%arr[j]);
				if(max_gop%arr[j]==0) {
					result++;
				}
			}
			System.out.println("result : "+result);
			if(result==arr.length-1) {
				break;
			}
			i++;
		}
		System.out.println(max_gop);
	}
}
