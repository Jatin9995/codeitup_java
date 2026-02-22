import java.util.Scanner;

public class Session49_Shape_PyramidPrinting_Part5 {

	public static void main(String[] args) {
		
		/*
		 *      *
		 *     ***
		 *    *****
		 *   *******
		 *  *********
		 *  
		 *      1
		 *     123
		 *    12345
		 *   1234567
		 *  123456789
		 *  
		 *      1
		 *     222
		 *    33333
		 *   4444444
		 *  555555555    
		 *      
		 *      
		 * 
		 * 
		 */
		
		
		int n, i, j, s;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		n=sc.nextInt();
		
		
		for(i=1; i<=n;i++) {
			
			//for printing space
			
			for(s=1; s<=n-i; s++) {    //n-i means ki 5 me se i ki value jo minues ho rahe hai utne space print honge
				System.out.print(" ");
			}
			
			for(j=1; j<=2*i-1; j++) {   //2*i-1 means ki utne start print honge. i se lekar jaise j1 hai or agar i=2 hai to 2*i-1=3 start print honge 1 se lekar.
				
				System.out.print(i);
			}
			
			System.out.println();
			
			
		}
		
		
		

	}

}
