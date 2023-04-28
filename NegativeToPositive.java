package week1.day2;

public class NegativeToPositive {
	int num=-25, temp=0;
	public void checkNum() {
		
		if(num<0) {
			System.out.println("The given Number is a Negative Number");
		}
		for(int i=0;i>num;i++) {
        	
        	temp=num*-1;
        
        	System.out.println(temp);
        	System.out.println("The given Number is converted into positive Number");
        	break;
		}
		
		
	}

	public static void main(String[] args) {
		NegativeToPositive obj=new NegativeToPositive();
		obj.checkNum();
		
	}

}
