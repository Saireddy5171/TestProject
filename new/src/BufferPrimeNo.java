import java.io.*;

public class BufferPrimeNo {
	public static void main(String[] arg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a number: ");
		String str= br.readLine();
		
		int num= Integer.parseInt(str);
		
		if(num%100==0 && num%400==0) {
			System.out.println("It's is a century year and a leap year");
		}else if(num%4==0) {
			System.out.println("It's is not a century year but a leap year");
		}else {
			System.out.println("It's is not a  leap year");
		}
	}
}
