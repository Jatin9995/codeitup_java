import java.util.Scanner;

public class Session50_Shape_PyramidPrinting_Part6 {

	public static void main(String[] args) {
		
	/*
	 * 
	 *  *********
	 *   *******
	 *    *****
	 *     ***
	 *      *
	 * 
	 *  123456789
	 *   1234567
	 *    12345
	 *     123
	 *      1
	 *      
	 *   111111111   
	 *    2222222
	 *     33333
	 *      444
	 *       5
	 *       
	 *   555555555
	 *    4444444
	 *     33333
	 *      222
	 *       1
	 *           
	 * 	
	 */
		
		
		int n, i, j, s, k;
		k=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		n=sc.nextInt();
		
		for (i=n; i>=1; i--) {
			
			for(s=1; s<=n-i ; s++) {
				System.out.print(" ");
			}
			
			for(j=1; j<=2*i-1;j++) {
				System.out.print("*");
			}
			
	
			
			System.out.println();
		}
		
		
		
		

	}

}
