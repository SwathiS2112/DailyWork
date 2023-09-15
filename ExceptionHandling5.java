package Demo;

import java.util.Scanner;

class Demo001 {
	void alpha() throws Exception{
		System.out.println("Connection Established1");
		try {
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter numerator");
			int a=scan.nextInt();
			System.out.println("Enter denomenator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("give non-zero number");
			throw e;
		}
		finally {
			System.out.println("Connection Terminated1");
	}
}
}
public class ExceptionHandling5 {

	public static void main(String[] args) {
		System.out.println("Connection Established");
		Demo001 d=new Demo001();
		try{
			d.alpha();
		}
		catch(Exception e) {
			System.out.println("handled in main method");
		}
		System.out.println("Connection Terminated");
	}
}

