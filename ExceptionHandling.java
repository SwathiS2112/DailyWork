package Demo;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			System.out.println("Connection established");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter number1");
			int a=s.nextInt();
			System.out.println("Enter number2");
			int b=s.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println("Denominator should be non-zero");
		}
		System.out.println("Connection terminated");
	}

}
