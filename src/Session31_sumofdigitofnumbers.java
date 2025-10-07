import java.util.Scanner;

public class Session31_sumofdigitofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//Ques: write a java program to find sum of digits of a number.
	/*
	 * sum of digits means like 242= 2+4+2=8	, means ki agar koi bhi digit diya hai to uska sum karke total result me aana chahea.
	 * 
	 */
		
		int n, sum;
		sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit to find the sum");
		n=sc.nextInt();
		
		while (n>0) {
			
			sum=sum + (n%10);
			n=n/10;
			
		}
		
		System.out.println("sum of digits :" + sum);
		
		
		

	}

}
