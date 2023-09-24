package Demo;

import java.util.Scanner;

class InvalidException extends Exception
{
	
}
class DrivingLicense{
	int a;
	void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Age");
		a=scan.nextInt();
		
	}
	void validation() throws Exception{
		
			
		if((a>=18)&&(a<=65)) {
			System.out.println("collect your License");
		}
		
		
		else {
			 if(a<18){
					System.out.println("you are too young");
					
				}
			else if(a>65) {
				System.out.println("calm down!!");
			}	
			InvalidException i=new InvalidException();
			System.out.println("Reenter the age");
			throw i;
		}
	}
}


class Govt{
	void init() {
		DrivingLicense e=new DrivingLicense();
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
public class CustomException2 {

	public static void main(String[] args) {
		Govt g=new Govt();
		g.init();

	}

}
