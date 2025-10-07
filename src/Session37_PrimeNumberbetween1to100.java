


public class Session37_PrimeNumberbetween1to100 {

	public static void main(String[] args) {
		
		/*
		 * Ques:-Write a program to print all prime numbers between 1 to 100
		 * 
		 * 2 loop use honge islye kyu ki divide karke pata lagana hai i ko divide karenge j se count nikalne k liye	
		 */
		
		
		
		int i, j, count, total = 0;
		count=0;
		
		for(i=1; i<=100; i++) {
			
			count=0;  // count ko 0 pe set kiya hai kyu ki har digit ka prime number search karna hai to jab divide hoga to count agar 2 aayega to prime number hoga islye 0 pe set hai taaki har number 
			          //divide karke pata chale ki count 2 hai ya us se jayada
			
			for(j=1; j<=i; j++) {
				if(i%j==0)
					count=count+1; //isko hum count++ bhi likh sakte hai
			}	
			
			if(count==2) {
				System.out.println(i);
			total=total+1;
			}
		}
	
		System.out.println("total prime numbers :" + total);

	}
	

}
