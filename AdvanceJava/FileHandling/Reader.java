import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter your name");
		String name = br.readLine();
		
		System.out.println("Enter your age");
		int age = Integer.parseInt(br.readLine());
		
		System.out.printf("Name: %s \nAge: %d",name , age);
		
	}
}
