import java.util.Scanner;

public class Session51_Shape_PyramidPrinting_Part7 {

	public static void main(String[] args) {
		
		/*
		 *              *
		 *             ***
		 *            *****
		 *           *******
		 *          *********
		 *           ******* 
		 *            *****
		 *             ***
		 *              *   
		 * 
		 * 
		 * 
		 */
		
	int n, i, j, s;
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows");
	n=sc.nextInt();
	
	for(i=1; i<=n; i++) {
		
		for(s=1; s<=n-i; s++) {
			System.out.print(" ");
		}
		
		for(j=1; j<=2*i-1; j++) {
			System.out.print(i);
		}
		
		System.out.println();
	}
	
	n=n-1;
	for(i=n; i>=1;i--) {
		for(s=1; s<=(n-i)+1;s++) {
			System.out.print(" ");
		}
		
		for(j=1; j<=2*i-1;j++) {
			System.out.print(i);
		}
		
		System.out.println();
	}
	
		
		
		

	}

}
