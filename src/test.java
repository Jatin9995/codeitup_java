
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find the Prime Number");
		n=sc.nextInt();

		for(int i=1; i<=n; i++) {
			if (n%i==0) {
				count=count+1;
			}
			
		}
		
		if (count==2) {
			System.out.println("Prime Number");;
			
		}else {
			System.out.println("Not Prime Number");
		}
	}

}
