import java.util.Iterator;
import java.util.Scanner;

public class test {

	public static void main(String[] args)  {

	
		int a , b, c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		
		
		System.out.println("Enter the second number");
		b=sc.nextInt();
		
		
		System.out.println("Enter the third number");
		c=sc.nextInt();
		
		System.out.println("Valaue of a=" + a + "\nValue of b=" + b + "\nValue of c=" + c);
		
		
		if (a>b && a>c) {
			System.out.println("a is Maximum Number: " + a );
		}else if (b>a && b>c) {
		
			System.out.println("b is Maximum Number: " + b);
			
		} else {
			System.out.println("c is Maximum Number:" + c);
		}
			
		
		
		
		
		
	}

}