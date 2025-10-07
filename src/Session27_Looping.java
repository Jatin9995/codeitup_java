import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Session27_Looping {

	/*
	 *Loop is used to execute a single statement or a block of statement n
times till the condition is true. In simple words we can say that loop is a way to
keep executing either a single statement or a block of statement n times till the
condition is true i.e. until a given condition becomes false.
While loop is called entry control loop. means ki pehle conditon check karta hai or agar true hota hai table body execute hoti hai.

Every loop contains three parts:
1. Initialization
2. Condition
3. Increment/Decrement
	 */

	public static void main (String[] args) {


//Ques 1: Write a program to print from 1.10 using while loop.
		
/*		int i=1;  //initialization
		
		while (i<=10) {     //condition
			
			System.out.println("Value of i :" + i);
			
			i++;  // increment/decrement operators
		
		}		
	
	
	*/

//Ques 2 : Write a program to print from 1 to n.
		
		int i, n;
		i=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number upto which you want to print");
		n=sc.nextInt();
		 while (i<=n) {
			 System.out.println("Value of i :" + i);
			 
			 i++;
		 }
			
	
	
	
	}
}
