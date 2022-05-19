
public class PositiveNegativeZero {
	public static void main(String[] args) {
		checkNumbers(0);
		
	}
	
	
	public static void checkNumbers(int var) {
		if(var>0) {
			System.out.println("Positive");
		}else if(var<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}
	}
	
}

 