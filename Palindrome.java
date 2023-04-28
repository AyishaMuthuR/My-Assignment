package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=34343,rev=1,rem=0;
		
		for(int temp=num/10;temp>10;temp++) {
			
			rem=num%10;
			rev=temp*10+rem;
			break;
			
		}
		if(rev==num) {
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The given number is not a palindrome");
		}

	}

}
