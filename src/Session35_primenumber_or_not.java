import java.util.Scanner;

public class Session35_primenumber_or_not {

	public static void main(String[] args) {
		
	/*
	 * Ques:- Write a java program to check whether a number is Prime or not?	
	 * 
	 * Prime number wo hote jiske factors 2 hote hai means ki wo khudh se divide hote hai or 1 se divide hote hai jaise ki 7. 7 khudh se divide hota ya phie 1 se
	 * 
	 * count naam ka variable lenge kyu ki hume count karna hai ki kitne factors hai.
	 * hume loop lagana hoga or 1 se lekar diye hue number tak divide karna hoga taaki check kar sake ki kis kis number se divide ho sakta hai or reminder 0 bachta hai. 
	 * 
	 */
		
	
		int i, count, n;
		i=1;
		count = 0;
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number to check whether it's a prime number or not");
		 n=sc.nextInt();
		 while (i<=n) {
			 if (n % i==0) 
				 count=count+1;
			 
			 i++;
		}
		 
		 if (count==2) 
				System.out.println("Given number is a Prime number");
			else 
				System.out.println("Given number is Not a Prime number");
			
	}

}








