
public class Session17_ifelse {

	/*
	 * Control Statement in Java
Control statements are used to control the flow of execution of statement in a programming language. Usually, all the statements are executed sequentially
but if we want to control the flow of execution then we use Control Statement.

Control Statements are divided into following two categories:
1. Selection Statement
a. if
b. switch ... case
2. Looping Statement
a. while
b. do-while
c. for

selection Statement
-------------------------------
Selection statement are used to execute a statement based on a condition. If the given condition is true, then only the statement inside it is executed
otherwise the else section is executed.
* if condition k sath agar single statement use kiya hai to curly brasis use karne ki jarurat nahi. wo statement automatically execute ho jayega.
* agar if condition k sath multiple statements hai to curly brasis use karna jaruri hai.

	 */
	

	public static void main(String[] args) {

	/*	
		int a=12;
		int b=10;
		
		if (a<b) 
			
			System.out.println("Value of a is less then b :" +" "+ "Value of b =" + b);
		else {
			System.out.println("Value of a is greater than b :" +" "+ "Value of a =" + a);
		}


*/
		
		//----------------------------------Conditional/Decision statement.-----------------------------------------
		
		//if-else and switch case are used for conditional statement and decision making
		
		/*int day=8;
		
		if(day==2) {
			System.out.println("Saurday");
			
		}
		
		else if (day==3) {
			System.out.println("Sunday");
		}
		
		else if (day==4) {
			System.out.println("Monday");
		}
		else if (day==5) {
			System.out.println("Tuesday");
		}
		
		else if (day==6) {
			System.out.println("Wednesday");
		}
		
		else if (day==7) {
			System.out.println("Thursday");
		}
		
		else if (day==8) {
			System.out.println("Friday");
		}

		else {
			System.out.println("Wrong input for the day  value");
		}
	}*/

	//switch case syntax:- 
	/* switch (expression){
	 * case value1:
	 * break;
	 * 
	 * case value2:
	 * break}  */
	
	//in switch case,  case value check and match the value mentioned in expression and execute.
	//break statement switch se exit karne k liye use kiya jata hai. agar break use nahi kiya or case value1 satisfy ho gaye to phir bhi
	//wo case value 2 par jayega check karne.
	//Default: it is used if all cases are not matched with the expression.
	
	//...........................................switch case...................................................
		
		int day=5;
		
		switch (day) {  //day is the expression 
		case 1:  //1 is the expression value
			System.out.println("Sunday");
			
			break;
		
		case 2:
			System.out.println("Monday");
			break;
			
		case 3:
		System.out.println("Tuesday");
		break;
		
		case 4:
			System.out.println("Wednesday");
			break;
			
		case 5:
			System.out.println("Thursday");
			break;
			
		case 6:
			System.out.println("Friday");
			break;
			
		case 7:
			System.out.println("Saturay");
			break;
			
			
		default:
			System.out.println("Wrong inputs for days");
			break;
		}

		
		
	}

}
