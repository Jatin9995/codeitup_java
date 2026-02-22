
public class Session42_Break_continue {

	public static void main(String[] args) {
		
	/*
	 * Break &  Continue statement in java
	 * 
	 * Break:- Break is a keyword which is used to break the execution of the loop/scope. Break curly braces {} k andar k program ko stop kar dega jaha used hota hai. curly braces k bahar k program execute ho sakte hai.
	 * 
	 * Continue: Continue is a keyword which is used to break the execution only for that particular condition and it keeps on executing its block.
	 * means ki {} k andar jaha pe bhi continue ka use hoga to wo particular condition execute nahi hogi, baaki sab execute hoga.	
	 * 
	 * 
	 */
		
		int i=0;
		
//---------------------Break------------------------------------		
		
/*		while(i<=10) {
			
			i++;
			System.out.println("Vlaue of i :" + i);
			
			if(i==5)
				break;
			
		
		}
		System.out.println("Execution stop at value of i :" + i);
		
		*/
		
//----------------------Continue--------------------------------------
		
		while(i<=10) {
			
			i++;
		if(i==6)  //6 execute nahi hoga yahi condition hai
			continue;
		
		System.out.println(i);
			
			
		}
		
		System.out.println("Execution stop");

	}

}
