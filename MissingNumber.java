package week1.day2;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,6,7,8};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]+1!=arr[i+1]) {
				System.out.println(arr[i]+1);
				break;
			}
		}

	}

}
