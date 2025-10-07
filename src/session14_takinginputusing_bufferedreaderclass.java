import java.io.*;

public class session14_takinginputusing_bufferedreaderclass {
	
/*
 * Taking Input using BufferedReader Class

BufferedReader is a class which is found in "io" package. So, in order to use
BufferedReader class we import "io" package in our program.
BufferedReader class is used to take user inputs just like the scanner class.	
 */

	public static void main(String[] args) throws Exception, IOException {
	
		int a,b;
		float sum;
		Float c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//bufferedreader class ka object banaya jo new inputstream ko read karke system me entry kara deta hai.
        System.out.println("Enter First Number");
       a=Integer.parseInt(br.readLine());//br.readline se jo bhi input aata hai wo string k format me aata hai kyu ki main method me String declared hai. so inko integer me change karne k liye interger.parseint method ka use kiya taaki integer value return mile sum karne k liye
        System.out.println("Enter Second Number");
        b=Integer.parseInt(br.readLine());
        System.err.println("Enter Decimal Number");
        c=Float.parseFloat(br.readLine());//string ko float me change karne k liye float.parsefloat ka use kiya.
        
        sum=a+b+c;
        System.out.println("Addition=" + sum);
      
	
		
		
	}
	
	
}
