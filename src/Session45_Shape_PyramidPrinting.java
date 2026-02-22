import java.util.Scanner;

public class Session45_Shape_PyramidPrinting {

	public static void main(String[] args) {
		
		int n,i,j;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of rows");
		n=sc.nextInt();
		
		
		//for rows(Parent loop)
		
		for(i=1;i<=n;i++) {
			
			for(j=1;j<=i;j++) {   //child loop i 1 se initialize hue. uske baad j 1 se initialize hua. jabtak j ki condition false nahi hoti tab tak loop chalta ahi. uske baad parent loop pe jata 
				
				System.out.print("*");  //printing star, if we print i then 1,22,333,4444,55555, if we print j=1,12,123,1234,12345, if we print i+j=2,34,456,5678,678910
			}
			
			System.out.println();  // use for changing the line
			
		}
		
		
		

	}

}
