
public class session08_IncrementDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
	/*	a++   ;   // Post-Increment
		++a    ;  // Pre-Increment
		a ;      // Just value
		--a    ; // Pre-Decrement
		a--   ;   // Post-Decrement
		++a    ;  // Pre-Increment
		
		*/
		System.out.println("value of a :" + a); //5
		System.out.println("value of a++: " + a++); //5
		System.out.println("Value of ++a :" + ++a);//7
		System.out.println("Value of a : " + a);//7
		System.out.println("value of --a :" + --a);//6
		System.out.println("value of a-- :" + a--);//6
		System.out.println("value of ++a : " + ++a);//6
		
		
/*
 * Step-by-Step Execution

a = 5 (initial value)

a++ → Post-Increment → पहले use करो (5), फिर बढ़ाओ

After this line, a = 6

++a → Pre-Increment → पहले बढ़ाओ, फिर use करो

Now a = 7

a; → Just value → a = 7

--a → Pre-Decrement → पहले घटाओ, फिर use करो

Now a = 6

a-- → Post-Decrement → पहले use करो (6), फिर घटाओ

After this line, a = 5

++a → Pre-Increment → पहले बढ़ाओ, फिर use करो

Now a = 6
 * 
 */
		
		
		
	}

}
