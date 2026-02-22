import java.util.Scanner;

public class Session48_Shape_PyramidPrinting_Part4 {

	public static void main(String[] args) {
		
		/*
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 * 12345
		 *  1234
		 *   123
		 *    12
		 *     1
		 *     
		 * 11111
		 *  2222
		 *   333
		 *    44
		 *     5
		 *     
		 * 55555
		 *  4444
		 *   333
		 *    22
		 *     1    
		 *        
		 * 
		 * 
		 */
		
	int n, i, j, s, k;
	k=1;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows");
	n=sc.nextInt();
	
	for(i=n; i>=1; i--) {
		for(s=1;s<=n-i; s++) {
			System.out.print(" ");
		}
		
		for(j=1; j<=i; j++) {
			System.out.print(k);
		}
		
		k++;
		
		System.out.println();
	}
	
	
	
			
		
		
		
		
	}

}
