import java.util.Scanner;

public class Session41_FindXraisedtothepower_Y {

	public static void main(String[] args) {

		/*
		 * Ques:- Write a java program to find X raise to the power Y
		 */
				
	//first we will take the input from the user of X and Y
		
		int x, y, pro=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base (value of x)");
		x=sc.nextInt();
		
		System.out.println("Enter Power (value of Y)");
		y=sc.nextInt();
		
//ab condition lagayenge ki x ko kaise y times multiply kare. y ki value ek count hai jitni bar hume x ko multiple karna hai. isme loop lagayenge y par taaki y times multiply kiya ja sakte
		
		while(y>0) {
		pro=pro*x;
		
		y--;   //y-- means ki y ki value jo actual hai us ko minues karna. for ex. y =3 or x=3, to x pehle 3 se multiply hoga, uske baad y-- se wo 2 hoga then x phir 3 se multiply hoga, then again same lopp, last me again x 3 se multiple hoga. x=3*3*3
		       //x raise to the power y hai means x y times multiply hoga.
		
		}
		
		System.out.println("value of x :" + pro);
		
	}

}
