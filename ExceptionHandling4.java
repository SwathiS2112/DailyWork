package Demo;

import java.util.Scanner;

class Demo01{
	void alpha() {
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
		}
		System.out.println("Connection Terminated1");
	}
}

class Demo02{
	void beta() {
		System.out.println("Connection Established2");
		
		Demo01 d1=new Demo01();
		d1.alpha();
		System.out.println("Connection Terminated2");
	
	}
}

class Demo03{
	void gamma() {
		System.out.println("Connection Established3");
		Demo02 d2=new Demo02();
		d2.beta();
		System.out.println("Connection Terminated3");
	
	}
}

public class ExceptionHandling4 {

	public static void main(String[] args) {
		System.out.println("Connection Established4");
		Demo03 d3=new Demo03();
		d3.gamma();
		System.out.println("Connection Terminated4");

	}

}
