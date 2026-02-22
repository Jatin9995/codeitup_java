import java.util.Scanner;

public class Session39_FibonacchiSeries {

	public static void main(String[] args) {

		/*
		 * Ques:- Write a java program to print Fibonacchi series
		 * 
		 * Fibonacchi serioes me hamare paas 2 values pehle se hoti hai:- 0 and 1. or plus krte hue jaate hai. jaise ki
		 * Example
		 * 0
		 * 1
		 * 1
		 * 2
		 * 3
		 * 5
		 */

		/*		int x=0, y=1, z=0, n;   //z sum calculate karne k liye liya hai, n me hum use input lete ki max value kaha tak ki hogi
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter max value");
		n=sc.nextInt();

		//condition

		while(z<=n) {
			System.out.println(z);
		x=y;
		y=z;
		z=x+y;

		}

		 */		

		//Ques:- Write a java program to print the Fibonacchi series till 10 terms
		
		int x=0, y=1,z=0, n,total=0, term=1; //term 1 set kiya hai kyu ki initialization 1 se ho raha hai or jaha tak n k through print karna hai waha tak jayega
		Scanner sc=new Scanner(System.in);
		System.out.println("Print the value till given terms");
		n=sc.nextInt();
		
		while(term<=n) {  //terms 1 se initialize hota hai islye <=n hai or 10 tak Fibonacchi series print karega
			
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;
			
			term++;
			
			
		}


	}

}
