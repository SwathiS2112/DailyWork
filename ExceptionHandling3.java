package Demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		System.out.println("Connection established");
		try {
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter numerator");
			int a=scan.nextInt();
			System.out.println("Enter denomenator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
			
			System.out.println("Enetr Arraysize");
			int n=scan.nextInt();
			int[] ar=new int[n];
			System.out.println("Enter the element");
			int ele=scan.nextInt();
			System.out.println("Enter Index");
			int index=scan.nextInt();
			ar[index]=ele;
			System.out.println(ar[index]);
		}
		catch(ArithmeticException a) {
			System.out.println("give non-zero input");
		}
		catch(NegativeArraySizeException n) {
			System.out.println("Give +ve input");
		}
		catch(InputMismatchException i) {
			System.out.println("Give matching input");
		}
		catch(ArrayIndexOutOfBoundsException f) {
			System.out.println("be in ur limits");
		}
		catch(Exception e) {
			System.out.println("Give valid input");
		}
		System.out.println("Connection terminated");

	}

}
