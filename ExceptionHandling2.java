package Demo;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		try {
			System.out.println("Connection established");
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int[] a=new int[n];
			System.out.println("array created successfully");
		}
		catch(Exception e){
			System.out.println("arxfcvhbjnk");
		}
		System.out.println("Connection terminated");

	}

}
