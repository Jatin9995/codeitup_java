import java.util.Scanner;

public class Session40_ArmstrongNumber {

	public static void main(String[] args) {
		
		/*
		 * Ques:- Write a java program to check whether a Number is Armstrong number or Not?
		 * 
		 * Armstrong number means ki koi bhi digit diya hai so uska count jitna jota hai wo har digit ki raise to the power me lagate ahi. uske baad value nikalte hai.
		 * jab sab digit ki raise to the power nikal jaye to sabko plus karte hai. or agar plus karne pe original number aa jaye to use Armstrong number kehte hai.
		 * 15.3 ko 15 calculate karte hai integer me., isko automatic type casting kehte hai.
		 */
		
		int n, z, count=0, digit, pro, sum=0; //count naam ka variable liya hai digit ka count calculate karbe k liye
	
// Pehle hum calculate karenge ki kitne digit ka number hai kyu ki jitne digit ka number hoga usko har digit k raise to the power me lagana hai.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value to find the Armstrong Number");
		n=sc.nextInt();   //user se input lenge
		z=n;  //n ki value to z me store kr diya hai kyu ki last me n ki value k sath result compare karna hoga.

		 // Count the number of digits		
		while(z>0) {
			count=count + 1;
			z=z/10;  // z/10 karne se digit ki last value har loop k sath decrease hoti jayegi or count ko calculate kr payenge
		}
		
		System.out.println("Number of digit :" + count);
		
		
		
//Now rest code to calculate	
		
		  // ✅ Reset z before using it again
        z = n;
		
		while(z>0) {
			
		digit= z%10;  //is se hume given number ka last digit mil jayega
		pro=1;
		for(int i=1; i<=count; i++)  {  // for loop se hum cube calcute karenge
			pro=pro*digit;
			
		}
		
		sum=sum+pro;  // ise se hum jo bhi cube be value aa rahe hai use plus karenge loop k ander he
		z=z/10;  //is se reminder ko decimal wali value hat jaati hai. jise automatic typecasting kehte hai.		
			
		}
		
	if(sum==n)	
		System.out.println("Armstrong Number :" + sum);
	
	else 
		System.out.println("Not Armstrong Number :" + sum);
	
		
		
		

	}
	

	

}
