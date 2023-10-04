package Demo;

import java.util.Scanner;

class Add extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number1");
		int a=scan.nextInt();
		System.out.println("Enter number2");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println(c);
		System.out.println("Adding Completed");
	}
}
class Printing extends Thread{
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

class Bank3 extends Thread{
	@Override
	public void run() {
		int pin=1234;
		System.out.println(pin);
		System.out.println("collect ur cash");
		System.out.println("Banking Compleated");
	}
}
public class MultiThreading2 {

	public static void main(String[] args) {
		Add a=new Add();
		Printing p=new Printing();
		Bank3 b=new Bank3();
		
		Thread t=  Thread.currentThread();
		t.setName("TAP");
		System.out.println(t.getName());
		
		//System.out.println(t.getPriority());
		//System.out.println(t.getThreadGroup());
		
		a.start();
		try
		{
			a.join();
		}
		catch(Exception e)
		{
			System.out.println("problem");
		}
		
		p.start();
		
		b.start();
	}

}
