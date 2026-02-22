import java.lang.classfile.AnnotationValue.OfAnnotation;

public class Session44_NestedLoop {

	public static void main(String[] args) {
		
		//ek loop k andar dusra loop hota hai to usko nested loop kehte hai.
		//When there is a loop inside another loop then it is called nested loop.
		
		//Parent loop k ek instance k liye child loop bar bar execute hota hai jab tak value false nahi ho jaati ya ternimate nahi ho jaati.
		
		
		for (int i=1; i<=3; i++) {
			
			System.out.println("When i :" + i);
			
			for(int j=1;j<=5;j++) {
				System.out.println(j);
			}
		

	}
	}
}
