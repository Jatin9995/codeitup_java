import java.util.Scanner;

public class Session30_reversenumber {
	
	
	
	public static void main(String[] args) {
		
		//Ques: Write a program to find the reverse of given number
		
/*	int n;   // n is the value that user will give
	int rev=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to find the reverse");
	
	n=sc.nextInt();
	
	while (n>0) {
		rev=(rev*10) + n%10;
		n=n/10;
		
	}
		
	System.out.println("Reverse number :" + rev);
	*/
		
		int n=287;
		int rev=0;
		
		while (n>0) {
			rev=(rev*10) + n%10;
			n=n/10;
		}
		
		System.out.println("value of reverse :" + rev);
	}
	


}
