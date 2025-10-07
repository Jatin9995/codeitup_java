import java.util.Scanner;

public class Session20_simple_Calculator_Program {

	public static void main(String[] args) {
		
	// Ques 1: Write a program to create a  simple calculator.
		
		int a,b,ch;
		
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
    a=sc.nextInt();
    
    System.out.println("Enter second number");
    b=sc.nextInt();
	
    System.out.println("first number entered by user =" + a+ "\nsecond number entered by user =" + b);
    
    System.out.println("Enter Your Choice 1->Add : 2->Subtract : 3->Multiply : 4->Divide");//print msg show karne k liye hai user ko bus.
    ch=sc.nextInt();
    
    if(ch==1)
    	System.out.println("Add :" + (a+b));
    else if(ch==2)
    	System.out.println("Subtract :" + (a-b));
    
    else if(ch==3)
    	System.out.println("Multiply :" + (a*b));
    
    else if(ch==4)
    	System.out.println("Divide :" + (a/b));
    
    else
		System.out.println("Invalid Choice");

	}

}
