import java.util.Scanner;

public class Session33_Palindrome {

	public static void main(String[] args) {
		
	/*
	 * Ques:- Write a java program to check whether a number is palindrome or not?
	 * Palindrome:- means kisi number ko reverse karo to same value aati hai use palindrome kehte hai. 525=525	
	 */
		//n=z hum islye karte hai kyu ki n ki value hum z me store karte hai taaki last me compare kar sake ki reverse number z k equal hai ki nahi. 
		// n variable hum user se lete hai input
		
		int n, rev, z;
		rev=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find palindrome");
		n=sc.nextInt();
	    z=n;  //z hum islye karte hai kyu ki n ki value hum z me store karte hai taaki last me compare kar sake ki reverse number z k equal hai ki nahi. yahanhumne z ko initialize kr diya
	// to find the reverse of a number	
		while(n>0) {
			rev=(rev*10) + n%10;
			n=n/10;
		}
		
	//conditions		
		if (rev==z) {
			System.out.println("The given number is a palindrome");
		}else {
			System.out.println("Given number is not a palindrome");
		}
		
		
	}

}
