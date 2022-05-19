
class Calc{
	int num1;
	int num2;
	int result;
	
	public void sum() {
		result=num1+num2;
	}
	
}
public class objectDemo {
	public static void main(String[] args) {
		Calc obj=new Calc();
		obj.num1=2;
		obj.num2=37;
		obj.sum();
		System.out.println(obj.result);
	}
}
