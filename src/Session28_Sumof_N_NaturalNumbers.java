import java.util.Scanner;

public class Session28_Sumof_N_NaturalNumbers {

	public static void main(String[] args) {

		// Ques 1: Write a java program to find sum of first "N" natural numbers.
		/*
		 * first N natural numbers means 1,2,3,4,5,....n. is me hum agar natural number n=4 lete hai to 1,2,3,4 sabko sum karenge jaise ki 1+2+3+4= 10		
		 * isko hume java programming k through karna hai. N hum user se lenge scanner class k throug. initialization 1 se hoga and add naam ka variable lenge sum karne k liye.
		 * 
		 */
		int i, n, add; // add variable sum karne k liya liya hai. n user input k liye.
		i=1;
		add=0; // add ki value 0 set ki hai kyu ki 0 me kuch bhi add karo to koi fark nahi padta 

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of N");
		n=sc.nextInt();	

		while (i<=n) {
			add=add+i;  //sum karne k liye natural numbers ka
			i++;
		}

		System.out.println("Value of add :" + add);


	}

}
