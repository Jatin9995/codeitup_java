import java.util.Scanner;

public class Session38_TableofGivenNumber {

	public static void main(String[] args) {

		/*
		 * Ques:- Write a program to print table of a given number.
		 */

		int i, n;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print the table");
		n=sc.nextInt();

		for(i=1; i<=10; i++) 
			System.out.println(n*i);
		
	}

}
