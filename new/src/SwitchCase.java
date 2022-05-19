import java.io.*;
public class SwitchCase {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a Character: ");
		char ch= (char) br.read();
		switch(ch) {
		case 'r' : System.out.println("Red");
		break;
		case 'b' : System.out.println("Blue");
		break;
		case 'g' : System.out.println("Green");
		break;
		case 'w' : System.out.println("White");
		break;
		
		}
		
	}
}
