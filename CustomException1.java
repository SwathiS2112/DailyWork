package Demo;

import java.util.Scanner;

class InvalidInputException extends Exception
{
	
}
class ElectionCommission{
	int a;
	void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Age");
		a=scan.nextInt();
	}
	void validation() throws Exception{
		if(a>=18) {
			System.out.println("GOOD,Go & Vote");
		}
		else {
			InvalidInputException i=new InvalidInputException();
			System.out.println("Reenter the age");
			throw i;
		}
	}
}


class Government{
	void init() {
		ElectionCommission e=new ElectionCommission();
		try {
			e.acceptInput();
			e.validation();
		}
		catch(Exception x) {
			try {
				e.acceptInput();
				e.validation();
			}
			catch(Exception y) {
				try {
					e.acceptInput();
					e.validation();
				}
				catch(Exception z) {
					System.out.println("Get Lost!!!!!");
				}
			}
		}
	}
}
public class CustomException1 {

	public static void main(String[] args) {
		Government g=new Government();
		g.init();

	}

}
