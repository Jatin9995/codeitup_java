import java.util.Scanner;

public class Session47_Shape_PyramidPrinting_Part3 {

	public static void main(String[] args) {
	
		
		/*
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****          
		 * 
		 *     1
		 *    12
		 *   123
		 *  1234
		 * 12345  
		 * 
		 * 	   1
		 *    22
		 *   333
		 *  4444
		 * 55555 
		 * 
		 *     2
		 *    34
		 *   456
		 *  5678
		 * 678910
		 * 
		 */
		
		
		int n, i,s,j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		n=sc.nextInt();
		

		
		for(i=1; i<=n; i++) {
			for(s=1; s<=n-i; s++) {
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++) {
				System.out.print(j+i);
			}
			
			System.out.println();
			
		}
			
		}
		
		
		

	}


