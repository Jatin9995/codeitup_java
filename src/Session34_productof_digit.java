import java.util.Scanner;

public class Session34_productof_digit {

	public static void main(String[] args) {


		/*
		 * Ques:- write a java program to find products of digits of a given  number
		 * ex number 542
		 */

      int n, pro=1;  // pro ko 1 oe islye set kiya hai kyu ki 1 se multiply karne pe koi fark nahi padta,. agar sum karna hota to 0 pe set karte
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number to find product of digit");
      n=sc.nextInt();
      
      while (n>0) {
    	  pro=pro * (n%10);
    	  n=n/10;
		
	}
      
      System.out.println("Product of digit :-" + pro);
      
		
	}

}
