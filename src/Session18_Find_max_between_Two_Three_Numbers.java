import java.util.Scanner;

public class Session18_Find_max_between_Two_Three_Numbers {

	public static void main(String[] args) {

		//Programming exercise with "if" & "else"
		//	Ques 1: Write a program to find max between Two Numbers
		//======================================================================

		/*		
		int a,b;

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number");
		a=sc.nextInt();

		System.out.println("Enter second Number");
		b=sc.nextInt();

		System.out.println("Value of a =" + a +"  "+ "\nValue of b :" +b);

		if (a>b) 
			System.out.println("Maximum Number :" + a);

		else {
			System.out.println("Maximum Number :" +b);
		}
		 */		

		//Ques 2: Write a progrtam to find max between three numbers.

		int a,b,c;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();

		System.out.println("Enter second number");
		b=sc.nextInt();
		
		System.out.println("Enter third number");
		c=sc.nextInt();
		
		System.out.println("Value of a =" + a + "\nValue of b =" + b + "\nValue of c =" + c);
		
		if (a>b && a>c) 
		System.out.println("Maximum Number :" + a);
		else if (b>a && b>c) 
			System.out.println("Maximum Number :" + b);
			
		else 
			System.out.println("Maximum Number :" +c);
		
		
	}

}
