package Demo;
import java.util.*;
import java.util.Scanner;

class Adding extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number1");
		int a=scan.nextInt();
		System.out.print("Enter number2");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("Adding Completed");
	}
}
class Print extends Thread{
	@Override
	public void run() {
		
		for(int i=65;i<=69;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(3000);

			}
			catch(Exception e) {
				System.out.println("problem");
			}
		}
		System.out.println("Printing Compleated");
	}
}

class Bank extends Thread{
	@Override
	public void run() {
		int pin=1234;
		System.out.println(pin);
		System.out.println("collect ur cash");
		System.out.println("Banking Compleated");
	}
}
public class MultiThreading {

	public static void main(String[] args) {
		Adding a=new Adding();
		Print p=new Print();
		Bank b=new Bank();
		
		a.start();
		p.start();
		b.start();

	}

}
