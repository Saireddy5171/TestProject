
public class methods {
	
	public float calucateSimpleInt(boolean simpleInt,int princpleAmount,float interest,int no_of_Months ) {
		float totalAmount=0;
		if(simpleInt) {
			 totalAmount=(interest/100)*(princpleAmount*no_of_Months)+princpleAmount;
		}
		else {
			System.out.println("in else");
		}
		System.out.println(totalAmount);
		return totalAmount;
		
		
	}
	
	
	public static void main(String[] args) {
		boolean simpleInt=true;
		int princpleAmount=200000;
		float interest=2;
		int no_of_Months=12;
		methods m=new methods();
		m.calucateSimpleInt(simpleInt, princpleAmount, interest, no_of_Months);
		
		  
		
		
	}
}
