import java.util.Scanner;

public class Session15_Scanner {

	public static void main(String[] args) {


		long a;
		String username1,b;
		double c;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name");
		username1 =sc.nextLine();
		
		
		System.out.println("Enter Mobile Number");
		a=sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("Enter Your Mail id");
		b=sc.nextLine();
		
		System.out.println("Enter Your Salary");
		c=sc.nextDouble();
	
		
		
		System.out.println("UserName =" + username1 + "\nMobile Number =" + a + "\nEmail Id =" + b + "\nSalary =" + c);

		


	}

}
