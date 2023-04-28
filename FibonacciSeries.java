package week1.day2;

public class FibonacciSeries {
    public void FibNum() {
    	int firstNum=0,secNum=1,range=8,sum;
    	System.out.println(firstNum);
    	System.out.println(secNum);
    	for(int i=2;i<range;i++) {
    		
    		sum=firstNum+secNum;
    		firstNum=secNum;
    		secNum=sum;
    		System.out.println(secNum);
    		
    	}
		
	}
	public static void main(String[] args) {
		FibonacciSeries obj=new FibonacciSeries ();
		obj.FibNum();

	}

}
