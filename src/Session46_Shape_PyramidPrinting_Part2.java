import java.util.Scanner;

public class Session46_Shape_PyramidPrinting_Part2 {

	public static void main(String[] args) {
		
		
		/*
		 * 12345
		 * 1234
		 * 123
		 * 12
		 * 1
		 * 
		 * 11111
		 * 2222
		 * 333
		 * 44
		 * 5
		 * 
		 * 23456
		 * 3456
		 * 456
		 * 56
		 * 6
		 * 
		 * 
		 * 55555
		 * 4444
		 * 333
		 * 22
		 * 1
		 * 
		 */
		
		
		int n,i,j,k;
		k=1;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of rows");
		n=sc.nextInt();
		
		for(i=n; i>=1;i--) {   //i>=1 rakha gaya hai kyu ki i last row me ek star print karwayega.
			for(j=1; j<=i; j++) {
				
				
				System.out.print(k+j);
			
			}
			
			k++;
			
			System.out.println();
			
		}
		
		


	}

}
