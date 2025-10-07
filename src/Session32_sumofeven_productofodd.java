import java.util.Scanner;

public class Session32_sumofeven_productofodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Ques:- Write a java program to find sum of even & product of odd
		//ex 2345:- even:-2+4, product of odd:- 3*5
/*		
		int n, sum, product,digit;    //yaha humne variable declare kiya hai.
		sum=0;  // 0 me kuch bhi plus karne pe uski value me koi fark nahi padta
		product=1;  //product ki value 1 le hai, kyu ki multiply karne pe kuch chanle nahi hoga but muktiplication karke value aayegi.
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number to find the sum of even & product of odd");
		n=sc.nextInt();
		
		while (n>0) {
			digit=n%10;  // isse reminder niklega jis se found karenge ki remindwr even hai ya odd or uske according condition lagayenge 
		if (digit % 2==0) 
			sum=sum + digit;
		else 
			product=product * digit;	

		n=n/10;
		
	}
	
		System.out.println("Sum of even :-" + sum + "\nProduct of odd :" + product );
		
	}

*/
		
		// Ques:-2 Write a java program to find sum of even and sum of odd

		
		int sum=0, odd=0, n, digit;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to find sum of even and sum of odd");
	
		n=sc.nextInt();
		while(n>0) {
		digit=n%10;
		if (digit%2==0) 
			sum=sum+digit;
			
			else 
				odd=odd+digit;
				
				n=n/10;

		}
		
		System.out.println("Sum of even :" + sum + "\nsum of odd : " + odd);

	}
	
		

}
