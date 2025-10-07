import java.util.Scanner;

public class Session36_FactorialofaNumber {

	public static void main(String[] args) {

		/*
		 * Ques:- Write a java program to find factorial of a given number
		 * factorial ka matlab ki apko jo bhi number diya gaya hai usko niche tak multiply karte aana hai. maan lo diya hua number 5 hai. so 5=5*4*3*2*1
		 */

		int n, fac;
		fac=1;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find the factorial");
		n=sc.nextInt();

		while (n>0) {
			fac=fac * n;
			n--;

		}

		System.out.println("Factorial :" + fac);

	}

}
