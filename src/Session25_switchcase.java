import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Session25_switchcase {

	/*
	 * Switch statement ka use hum tab karte hain jab hume user ke choice ke hisaab se koi task perform karna ho.
Iska functionality lagbhag if statement jaisa hi hota hai.
👉 Switch statement mein mainly 3 keywords hote hain:
case – Yeh check karta hai ki user ne jo value pass ki hai, wo kis case se match karti hai.
break – Yeh ek case execute hone ke baad usko exit karne ke liye use hota hai. Agar break nahi lagayenge to next case bhi run ho jaayega (isko “fall through” kehte hain).
default – Yeh tab execute hota hai jab koi bhi case match nahi hota, matlab user ne invalid choice di ho.	
	 */

	public static void main(String[] args) {

		int a,b, ch;

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first Number");
		a=sc.nextInt();

		System.out.println("Enter second Number");
		b=sc.nextInt();

		System.out.println("Enter Your choise 1->Add 2->Subtract 3->Multiply 4->Divide");
		ch=sc.nextInt();

		switch (ch) {
		case 1: 
			System.out.println("Addition :" + (a+b));
			break;

		case 2:
			System.out.println("Subtraction :" + (a-b));
			break;

		case 3:
			System.out.println("Multiplication :" + (a*b));
			break;

		case 4:
			System.out.println("Division :" + (a/b));
			break;

		default:
			System.out.println("Invalid Choice");
		}


	}




}


