package week1.day1;

public class Mobile {
	
	public void makeCall() {
		
		String model="Samsung";
		
		float weight= 10.5f;
		
		System.out.println(model);
		System.out.println(weight);
		
	}
	public void sendSms() {
		
		int cost= 20000;
		
		boolean fullCharge = true;
		
	    System.out.println(cost);
	    
	    System.out.println(fullCharge);
		
	}

	public static void main(String[] args) {
		
		Mobile object = new Mobile();
		
		object.makeCall();
		
        object.sendSms();
         System.out.println("This is my Mobile");
	}

}
