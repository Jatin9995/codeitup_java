import java.util.Scanner;

public class Session19_programtocheck_Odd_Even_numbers {


	public static void main(String[] args) {

			
		/*	
		A number is called even if it is completely divisible by 2 (no remainder).
		Examples: 0, 2, 4, 6, 8, 10, 12, ...
		Rule: If the last digit of a number is 0, 2, 4, 6, or 8, then it’s even.

			A number is called odd if it is not completely divisible by 2 (remainder = 1).
            Examples: 1, 3, 5, 7, 9, 11, 13, ...
            Rule: If the last digit of a number is 1, 3, 5, 7, or 9, then it’s odd.
            
            % is called the modulus operator (or remainder operator).It is used to find the remainder when one number is divided by another.
		 */
		
//Ques 1: Write a program to check a number is odd or even.	

	/*	int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to Check Even or Odd");
		a=sc.nextInt();
		System.out.println("Number entered by user :" + a);
		if (a%2==0)
			System.out.println("Even");
		else
		System.out.println("Odd");
	*/	
		
//Ques : Write a program to find a number is positive/negative/zero.
		
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number to check if it is Positive/Negative/Zero Number");
	    a=sc.nextInt();
	    System.out.println("Number entered by user :" + a);
	    if(a>0)
	    	System.out.println("Positive Number");
	    else if (a<0)
	    	System.out.println("Negative Number");
	    else
        System.out.println("Zero number");			
		

		
	}

}
