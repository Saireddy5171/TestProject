import java.util.Scanner;

public class Integers {

	public static void main(String[] args){
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter a Value");
		int i= inp.nextInt();
		boolean a=false;
		if(a==true) {
			for(i=0;i<=10;i++){
				System.out.println(i);
			}	
		}else {
			while(i<10) {
				System.out.println(i);
				i++;
			}
		}
	}	
}