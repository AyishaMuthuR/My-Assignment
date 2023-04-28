package week1.day2;

import java.util.Arrays;

public class SecondSmallestNum {
	public void arraynum() {
		
		int[] arr= {23,45,67,32,89,22};
		
		for(int i=0;i<arr.length-1;i++){
			Arrays.sort(arr);
			System.out.println(arr[i]);
		}
		if(arr[0]<arr[1]) {
		
			System.out.println("The second smallest Number in the Array is"+arr[1]);
		}
	}

	public static void main(String[] args) {
		
		SecondSmallestNum object=new SecondSmallestNum();
		object.arraynum();

	}

}